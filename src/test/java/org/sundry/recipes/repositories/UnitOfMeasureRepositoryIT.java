package org.sundry.recipes.repositories;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.sundry.recipes.model.UnitOfMeasure;

import java.util.Optional;

import static org.junit.Assert.*;


/**
 * Created by kon1299 on 2019-09-16
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class UnitOfMeasureRepositoryIT {
  
  @Autowired
  UnitOfMeasureRepository unitOfMeasureRepository;
  
  @Before
  public void setUp() throws Exception {
  }
  
  @Test
  public void findByDescription() throws Exception {
  
    Optional<UnitOfMeasure> uomOptional = unitOfMeasureRepository.findByDescription("TeaSpoon");
    
    assertEquals("TeaSpoon", uomOptional.get().getDescription());
  
  }
  
  @Test
  public void findByDescriptionCup() throws Exception {
    
    Optional<UnitOfMeasure> uomOptional = unitOfMeasureRepository.findByDescription("Cup");
    
    assertEquals("Cup", uomOptional.get().getDescription());
    
  }
}