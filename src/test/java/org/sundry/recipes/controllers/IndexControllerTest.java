package org.sundry.recipes.controllers;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;
import org.sundry.recipes.repositories.RecipeRepository;
import org.sundry.recipes.service.RecipeService;
import org.sundry.recipes.service.RecipeServiceImpl;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;


/**
 * Created by kon1299 on 2019-07-19
 */
public class IndexControllerTest {
  
  @Mock
  RecipeService recipeService;
  
  @Mock
  Model model;
  
  IndexController indexController;
  
  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
    indexController = new IndexController(recipeService);
  }
  
  @Test
  public void getIndex() {
    String viewName  = indexController.getIndex(model);
    assertEquals("index", viewName);
    verify(recipeService, times(1)).getRecipes();
    verify(model, times(1)).addAttribute("recipes", recipeService.getRecipes());
  }
}