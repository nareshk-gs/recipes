package org.sundry.recipes.model;

import javax.persistence.*;

/**
 * Created by kon1299 on 2019-06-26
 */
@Entity
public class UnitOfMeasure {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String description;
  
  public Long getId() {
    return id;
  }
  
  public void setId(Long id) {
    this.id = id;
  }
  
  public String getDescription() {
    return description;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }
  
}
