package org.sundry.recipes.repositories;

import org.springframework.data.repository.CrudRepository;
import org.sundry.recipes.model.Recipe;

/**
 * Created by kon1299 on 2019-06-26
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
