package org.sundry.recipes.service;

import org.sundry.recipes.model.Recipe;

import java.util.Set;

/**
 * Created by kon1299 on 2019-07-16
 */
public interface RecipeService {
  
  Set<Recipe> getRecipes();
}
