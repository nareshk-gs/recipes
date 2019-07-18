package org.sundry.recipes.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by kon1299 on 2019-06-25
 */
@Data
@Entity
public class Ingredient {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String description;
  private BigDecimal amount;
  
  /*@ManyToOne
  private Recipe recipe;*/
  
  @OneToOne
  @JoinTable(name = "ingredient_uom",
          joinColumns = @JoinColumn(name = "ingredient_id"),
          inverseJoinColumns = @JoinColumn(name = "uom_id"))
  private UnitOfMeasure uom;
  
  public Ingredient(String description, BigDecimal amount, UnitOfMeasure uom) {
    this.description = description;
    this.amount = amount;
    this.uom = uom;
  }
  
  /*public Ingredient(String description, BigDecimal amount, UnitOfMeasure uom, Recipe recipe) {
    this.description = description;
    this.amount = amount;
    this.uom = uom;
    this.recipe = recipe;
  }*/
  

}
