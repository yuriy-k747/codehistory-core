package dev.codehistory.core.util;

import dev.codehistory.core.entities.IdEntity;

import java.lang.reflect.InvocationTargetException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.time.ZoneId;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CommonUtil {
  public static final ZoneId ZONE_ID = ZoneId.systemDefault();

  private CommonUtil() {
    throw new IllegalStateException("CommonUtil is utils");
  }

  public static int tryParse(String value, int defaultVal) {
    try {
      return Integer.parseInt(value);
    } catch (NumberFormatException e) {
      return defaultVal;
    }
  }

  public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
    Set<Object> seen = ConcurrentHashMap.newKeySet();
    return t -> seen.add(keyExtractor.apply(t));
  }

  public static <T> boolean listEqualsIgnoreOrder(List<T> list1, List<T> list2) {
    return new HashSet<>(list1).equals(new HashSet<>(list2));
  }

  public static <T extends IdEntity> Long lastId(Collection<T> ids) {
    if(ids.isEmpty()) {
      return 0L;
    }

    List<T> sorted = ids.stream()
        .filter(t -> t.getId() != null)
        .sorted(Comparator.comparing(IdEntity::getId)).collect(Collectors.toList());

    return sorted.isEmpty() ? 0L : sorted.get(sorted.size() - 1).getId();
  }

  public static <T extends IdEntity> T firstOrDefault(Collection<T> coll, Predicate<T> func) {
    return coll.stream()
        .filter(func)
        .findFirst()
        .orElse(null);
  }

  public static <T> T first(Collection<T> coll, Predicate<T> func) {
    Optional<T> find = coll.stream()
        .filter(func)
        .findFirst();
    
    assert find.isPresent();

    return find.get();
  }

  public static boolean isNullOrDefault(Integer val) {
    return val == null || val == 0;
  }

  public static boolean isNullOrDefault(Long val) {
    return val == null || val == 0L;
  }

  public static <T> T put(Map<T, T> map, T entity) {
    if(map.containsKey(entity)) {
      return map.get(entity);
    } else {
      map.put(entity, entity);
    }

    return entity;
  }

  public static <T extends IdEntity> T putIdEntity(Map<Long, T> map, T entity) {
    if(map.containsKey(entity.getId())) {
      return map.get(entity.getId());
    } else {
      map.put(entity.getId(), entity);
    }

    return entity;
  }

  public static <T> T getOrCreate(Map<Long, T> map, Long id, Class<T> clazz){
    if(map.containsKey(id)) {
      return map.get(id);
    } else {
      T entity = null;
      try {
        entity = clazz.getDeclaredConstructor().newInstance();
      } catch (Exception e) {
        // log or throw error "Failed to create an instance"
        return null;
      }

      map.put(id, entity);
      return entity;
    }
  }

  public static <T, V> V put(Map<T, V> map, T entity, Class<V> clazz) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
    if(map.containsKey(entity)) {
      return map.get(entity);
    } else {
      V link = clazz.getDeclaredConstructor().newInstance();
      map.put(entity, link);
      return link;
    }
  }

  public static String toCommaSeparated(Long[] vals) {
    return toCommaSeparated(Arrays.asList(vals));
  }
  
  public static String toCommaSeparated(String[] vals) {
    return toCommaSeparatedString(Arrays.asList(vals));
  }
  
  public static <T extends IdEntity> Map<Long, T> toHashMap(Collection<T> vals) {
    HashMap<Long, T> res = new HashMap<>();
  
    for (T val : vals) {
      res.put(val.getId(), val);
    }
    
    return res;
  }
  
  public static <T extends IdEntity> String toCommaSeparatedEx(Collection<T> vals) {
    List<Long> ids = new ArrayList<>();
    for (T val : vals) {
      ids.add(val.getId());
    }
    
    return toCommaSeparated(ids);
  }
  
  public static String toCommaSeparated(Collection<Long> vals) {
    if(vals.isEmpty()) {
      return "";
    }

    StringBuilder builder = new StringBuilder();
    for(Long val : vals) {
      builder.append(String.format("%d", val)).append(",");
    }
    builder.deleteCharAt(builder.length() - 1);

    return builder.toString();
  }
  
  public static String toCommaSeparatedString(Collection<String> vals) {
    if(vals.isEmpty()) {
      return "";
    }
    
    StringBuilder builder = new StringBuilder();
    for(String val : vals) {
      builder.append(String.format("'%s'", val)).append(",");
    }
    builder.deleteCharAt(builder.length() - 1);
    
    return builder.toString();
  }

  public static boolean hasColumn(ResultSet rs, String columnName) throws SQLException {
    ResultSetMetaData metaData = rs.getMetaData();
    int columns = metaData.getColumnCount();
    for (int i = 1; i <= columns; i++) {
      if (columnName.equals(metaData.getColumnName(i))) {
        return true;
      }
    }
    return false;
  }

  public static <T> Map<T, T> fromCollectionToMirrorMap(Collection<T> coll) {
    HashMap<T, T> res = new HashMap<>(coll.size());
    for(T entity : coll) {
      res.put(entity, entity);
    }

    return res;
  }

  public static <T extends IdEntity> Map<Long, T> fromCollectionToIdMap(Collection<T> coll) {
    HashMap<Long, T> res = new HashMap<>(coll.size());

    for(T item : coll) {
      res.put(item.getId(), item);
    }

    return res;
  }

  public static <T extends IdEntity> T put(Map<T, T> map, T entity) {
    if(map.containsKey(entity)) {
      return map.get(entity);
    } else {
      map.put(entity, entity);
    }

    return entity;
  }

  public static <TParent extends IdEntity, TChild extends IdEntity> Map<TParent, Collection<TChild>> compileOneToMany(
      Collection<TParent> parents,
      Collection<TChild> childs,
      Function<TChild, Long> getParentId) {
    HashMap<Long, Collection<TChild>> idChildMap = new HashMap<>();
    HashMap<Long, TParent> idParentMap = new HashMap<>();

    for(TParent parent : parents) {
      idParentMap.put(parent.getId(), parent);
    }

    for(TChild child : childs) {
      Long parentId = getParentId.apply(child);
      if(idChildMap.containsKey(parentId)) {
        idChildMap.get(parentId).add(child);
      } else {
        Collection<TChild> childColl = new ArrayList<>();
        childColl.add(child);
        idChildMap.put(parentId, childColl);
      }
    }

    HashMap<TParent, Collection<TChild>> res = new HashMap<>(idParentMap.size());
    for(var entry : idParentMap.entrySet()) {
      TParent parent = entry.getValue();
      Collection<TChild> childColl = idChildMap.get(entry.getKey());
      res.put(parent, childColl);
    }

    return res;
  }

  public static <TParent extends IdEntity, TChild extends IdEntity> void linkEntities(
      Collection<TParent> parents,
      Collection<TChild> childs,
      Function<TChild, Long> lookingForParentId,
      BiConsumer<TChild, TParent> setRelation
  ) {
    Map<Long, TParent> parentsMap = CommonUtil.fromCollectionToIdMap(parents);

    for(TChild child : childs) {
      TParent parent = parentsMap.get(lookingForParentId.apply(child));
      setRelation.accept(child, parent);
    }
  }

  public static <TLeft extends IdEntity, TRight extends IdEntity> Map<TLeft, TRight> compileOneToOne(
      Collection<TLeft> lefts,
      Collection<TRight> rights,
      Function<TRight, Long> getLeftId
  ) {
    HashMap<Long, TLeft> mapLeft = new HashMap<>();
    HashMap<Long, TRight> mapRight = new HashMap<>();

    for(TLeft left : lefts) {
      mapLeft.put(left.getId(), left);
    }

    for(TRight right : rights) {
      mapRight.put(right.getId(), right);
    }

    HashMap<TLeft, TRight> res = new HashMap<>();
    for(var entry : mapRight.entrySet()) {
      Long leftId = getLeftId.apply(entry.getValue());
      res.put(mapLeft.get(leftId), entry.getValue());
    }

    return res;
  }

  public static <T extends IdEntity> Long[] getIds(Collection<T> idEntities) {
    Long[] res = new Long[idEntities.size()];

    int idx = 0;
    for (T entity : idEntities) {
      res[idx++] = entity.getId();
    }

    return res;
  }
}
