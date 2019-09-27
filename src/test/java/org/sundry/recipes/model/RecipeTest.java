package org.sundry.recipes.model;

import org.junit.Before;
import org.junit.Test;
import org.sundry.recipes.bootstrap.RecipeBootstrap;
import org.sundry.recipes.repositories.RecipeRepository;
import org.sundry.recipes.service.RecipeServiceImpl;

import java.util.stream.Collectors;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;


/**
 * Created by kon1299 on 2019-09-23
 */
public class RecipeTest {
  
  Recipe recipe;
  
  @Before
  public void setUp() throws Exception {
    
    recipe = new Recipe();
    
  }
  
  @Test
  public void getId() {
    
    recipe.setId(1L);
    
    assertThat(recipe.getId(), is(equalTo(1L)));
  }
  
  @Test
  public void getDescription() {
    
    recipe.setDescription("test");
    assertThat(recipe.getDescription(), is(equalTo("test")));
  }
  
  @Test
  public void getPrepTime() {
    recipe.setPrepTime(30);
    assertThat(recipe.getPrepTime(), is(equalTo(30)));
  }
  
  @Test
  public void getCookTime() {
    recipe.setCookTime(10);
    assertThat(recipe.getCookTime(), is(equalTo(10)));
  }
  
  @Test
  public void getServings() {
    recipe.setServings(5);
    assertThat(recipe.getServings(), is(equalTo(5)));
  }
  
  @Test
  public void getSource() {
    recipe.setSource("web");
    assertThat(recipe.getSource(), is(equalTo("web")));
  }
  
  @Test
  public void getUrl() {
    recipe.setUrl("url");
    assertThat(recipe.getUrl(), is(equalTo("url")));
  }
  
  @Test
  public void getDirections() {
    recipe.setDirections("who cares");
    assertThat(recipe.getDirections(), containsString("care"));
  }
  
  @Test
  public void getDifficulty() {
    recipe.setDifficulty(Difficulty.HARD);
    assertThat(recipe.getDifficulty(), is(equalTo(Difficulty.HARD)));
  }
  
  @Test
  public void getNotes() {
    Notes notes = new Notes();
    recipe.setNotes(notes);
    assertThat(recipe.getNotes(), is(equalTo(notes)));
  }
}