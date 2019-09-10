package org.sundry.recipes.model;

import org.junit.Before;
import org.junit.Test;

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
  }
  
  @Test
  public void getRecipes() {
  }
}