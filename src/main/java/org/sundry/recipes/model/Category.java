package org.sundry.recipes.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.context.annotation.EnableLoadTimeWeaving;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by kon1299 on 2019-06-25
 */
@Data
@EqualsAndHashCode(exclude = {"recipes"})
@Entity
public class Category {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String categoryName;

  @ManyToMany(mappedBy = "categories")
  private Set<Recipe> recipes;
  
}
