package org.sundry.recipes.service;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.sundry.recipes.model.Recipe;
import org.sundry.recipes.repositories.RecipeRepository;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


/**
 * Created by kon1299 on 2019-07-19
 */
public class RecipeServiceImplTest {
  
  RecipeServiceImpl recipeService;
  
  @Mock
  RecipeRepository recipeRepository;
  
  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
    recipeService = new RecipeServiceImpl(recipeRepository);
  }
  
  @Test
  public void getRecipes() {
    Recipe recipe = new Recipe();
    HashSet recipesData = new HashSet();
    recipesData.add(recipe);
    
    when(recipeService.getRecipes()).thenReturn(recipesData);
  
    Set<Recipe> recipes = recipeService.getRecipes();
    assertEquals(1, recipes.size());
    verify(recipeRepository, times(1)).findAll();
  }
}