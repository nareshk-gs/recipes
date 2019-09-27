package org.sundry.recipes.model;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


/**
 * Created by kon1299 on 2019-09-19
 */
public class IngredientTest {
  
  Ingredient ingredient;
  
  @Before
  public void setUp() throws Exception {
    UnitOfMeasure uom = new UnitOfMeasure();
    uom.setId(1L);
    uom.setDescription("TeaSpoon");
    ingredient = new Ingredient("salt", new BigDecimal(1), uom);
  }
  
  @Test
  public void getId() {
    ingredient.setId(1L);
    assertThat(ingredient.getId(), is(equalTo(1L)));
  }
  
  @Test
  public void getDescription() {
    assertThat(ingredient.getDescription(), is(equalTo("salt")));
  }
  
  @Test
  public void getAmount() {
    assertThat(ingredient.getAmount(), is(equalTo(new BigDecimal(1))));
  }
  
  @Test
  public void getUom() {
    assertThat(ingredient.getUom().getId(), is(equalTo(1L)));
    assertThat(ingredient.getUom().getDescription(), is(equalTo("TeaSpoon")));
  }
}