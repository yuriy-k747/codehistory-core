package dev.codehistory.core.index;

import dev.codehistory.core.entities.IdEntity;

import java.util.Collection;
import java.util.stream.Collectors;

public abstract class DataSnapshot {
  protected <T extends IdEntity> void generateIds(Collection<T> entities, Long startWith) {
    Long current = startWith;
    for(IdEntity id : entities) {
      id.setId(current++);
    }
  }

  protected <T extends IdEntity> Collection<T> onlyNew(Collection<T> all) {
    return all.stream()
        .filter(t -> t.getId() == null)
        .collect(Collectors.toList());
  }
}
