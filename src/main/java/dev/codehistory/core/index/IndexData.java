package dev.codehistory.core.index;

import dev.codehistory.core.entities.IdEntity;

import java.util.concurrent.ConcurrentHashMap;

public class IndexData {

  protected static synchronized <T extends IdEntity> T put(ConcurrentHashMap<T, T> map, T entity) {
    if(map.containsKey(entity)) {
      return map.get(entity);
    } else {
      map.put(entity, entity);
    }

    return entity;
  }

  protected static synchronized <T extends IdEntity, String> T put(ConcurrentHashMap<String, T> map, String key, T entity) {
    if(map.containsKey(key)) {
      return map.get(key);
    } else {
      map.put(key, entity);
    }

    return entity;
  }
}
