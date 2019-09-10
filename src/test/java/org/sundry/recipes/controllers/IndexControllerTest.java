package org.sundry.recipes.controllers;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;
import org.sundry.recipes.model.Recipe;
import org.sundry.recipes.repositories.RecipeRepository;
import org.sundry.recipes.service.RecipeService;
import org.sundry.recipes.service.RecipeServiceImpl;

import java.util.HashSet;
import java.util.Set;

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
  
    Set<Recipe> recipes = new HashSet<>();
    recipes.add(new Recipe());
    Recipe r1 = new Recipe();
    r1.setId(1L);
    recipes.add(r1);
    
    when(recipeService.getRecipes()).thenReturn(recipes);
  
    ArgumentCaptor<Set<Recipe>> argumentCaptor = ArgumentCaptor.forClass(Set.class);
    
    
    String viewName  = indexController.getIndex(model);
    assertEquals("index", viewName);
    verify(recipeService, times(1)).getRecipes();
    verify(model, times(1)).addAttribute(eq("recipes"), argumentCaptor.capture());
    Set<Recipe> set = argumentCaptor.getValue();
    assertEquals(2, set.size());
  }
}