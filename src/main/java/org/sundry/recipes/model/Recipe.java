package org.sundry.recipes.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by kon1299 on 2019-06-25
 */
@Data
@Entity
public class Recipe {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  private String description;
  private Integer prepTime;
  private Integer cookTime;
  private Integer servings;
  private String source;
  private String url;
  
  @Lob
  private String directions;
  
  @Enumerated(value = EnumType.STRING)
  private Difficulty difficulty;
  
  @Lob
  private Byte[] image;
  
  @OneToOne(cascade = CascadeType.ALL)
  private Notes notes;
  
  //@OneToMany(cascade = CascadeType.ALL, mappedBy = "recipe")
  @OneToMany(cascade = CascadeType.ALL)
  private Set<Ingredient> ingredients = new HashSet<>();
  
  @ManyToMany
  @JoinTable(name = "recipe_category",
             joinColumns = @JoinColumn(name = "recipe_id"),
             inverseJoinColumns = @JoinColumn(name = "category_id"))
  private Set<Category> categories = new HashSet<>();
  
  public void setNotes(Notes notes) {
    this.notes = notes;
  }
  
  public Recipe addIngredient(Ingredient ingredient) {
    //ingredient.setRecipe(this);
    this.ingredients.add(ingredient);
    return this;
  }
  
}
