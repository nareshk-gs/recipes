package org.sundry.recipes.model;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;


/**
 * Created by kon1299 on 2019-07-19
 */
public class CategoryTest {
  
  Category category;
  
  @Before
  public void setUp() throws Exception {
    category = new Category();
  }
  
  @Test
  public void getId() {
    Long id = 4L;
    category.setId(id);
    assertEquals(id, category.getId());
  }
  
  @Test
  public void getCategoryName() {
    String categoryName = "testCat";
    category.setCategoryName(categoryName);
    assertEquals(categoryName, category.getCategoryName());
  }
  
  @Test
  public void getRecipes() {
    Recipe r1 = new Recipe();
    r1.setId(1L);
    Recipe r2 = new Recipe();
    r2.setId(2L);
    Set<Recipe> recipes = new HashSet<>();
    recipes.add(r1);
    recipes.add(r2);
    category.setRecipes(recipes);
    assertEquals(2, category.getRecipes().size());
  }
}