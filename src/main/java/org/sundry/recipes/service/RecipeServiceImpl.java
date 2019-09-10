package org.sundry.recipes.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.sundry.recipes.model.Recipe;
import org.sundry.recipes.repositories.RecipeRepository;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by kon1299 on 2019-07-16
 */
@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService {
  
  private final RecipeRepository recipeRepository;
  
  public RecipeServiceImpl(RecipeRepository recipeRepository) {
    this.recipeRepository = recipeRepository;
  }
  
  @Override
  public Set<Recipe> getRecipes() {
    Set<Recipe> recipes = new HashSet<>();
    log.debug("I am lombok");
    recipeRepository.findAll().iterator().forEachRemaining(recipes :: add);
    return recipes;
  }
}
