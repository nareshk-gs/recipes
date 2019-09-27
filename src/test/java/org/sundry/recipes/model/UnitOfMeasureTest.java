package org.sundry.recipes.model;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;


/**
 * Created by kon1299 on 2019-09-23
 */
public class UnitOfMeasureTest {
  
  
  UnitOfMeasure uom = new UnitOfMeasure();
  
  @Before
  public void setUp() throws Exception {
    uom.setId(1L);
    uom.setDescription("cup");
  }
  
  @Test
  public void getId() {
    assertThat(uom.getId(), is(equalTo(1L)));
  }
  
  @Test
  public void getDescription() {
    assertThat(uom.getDescription(), is(equalTo("cup")));
  }
}