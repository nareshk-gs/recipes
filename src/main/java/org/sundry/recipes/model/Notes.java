package org.sundry.recipes.model;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by kon1299 on 2019-06-25
 */
@Data
@Entity
public class Notes {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  /*@OneToOne
  private Recipe recipe;*/
  
  @Lob
  private String recipeNotes;
  

}
