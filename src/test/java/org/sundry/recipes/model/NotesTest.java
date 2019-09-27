package org.sundry.recipes.model;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;


/**
 * Created by kon1299 on 2019-09-19
 */
public class NotesTest {
  
  public Notes notes = new Notes();
  
  @Before
  public void setUp() throws Exception {
    notes.setId(1L);
    notes.setRecipeNotes("Notes");
  }
  
  @Test
  public void getId() {
    assertThat(notes.getId(), is(equalTo(1L)));
  }
  
  @Test
  public void getRecipeNotes() {
    assertThat(notes.getRecipeNotes(), is(equalTo("Notes")));
  }
}