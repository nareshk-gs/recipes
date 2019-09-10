package org.sundry.recipes.model;

import lombok.*;

import javax.persistence.*;

/**
 * Created by kon1299 on 2019-06-26
 */
@Data
@Entity
public class UnitOfMeasure {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String description;
  
}
