package org.sundry.recipes.repositories;

import org.springframework.data.repository.CrudRepository;
import org.sundry.recipes.model.Category;

import java.util.Optional;

/**
 * Created by kon1299 on 2019-06-26
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
  
  Optional<Category> findByCategoryName(String categoryName);
}
