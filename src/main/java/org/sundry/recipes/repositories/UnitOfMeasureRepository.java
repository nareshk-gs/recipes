package org.sundry.recipes.repositories;

import org.springframework.data.repository.CrudRepository;
import org.sundry.recipes.model.UnitOfMeasure;

import java.util.Optional;

/**
 * Created by kon1299 on 2019-06-26
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
  
  Optional<UnitOfMeasure> findByDescription(String description);
}
