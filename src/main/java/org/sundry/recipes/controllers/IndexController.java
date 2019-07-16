package org.sundry.recipes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.sundry.recipes.model.Category;
import org.sundry.recipes.model.UnitOfMeasure;
import org.sundry.recipes.repositories.CategoryRepository;
import org.sundry.recipes.repositories.UnitOfMeasureRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

/**
 * Created by kon1299 on 2019-03-19
 */
@Controller
public class IndexController {
  
  private CategoryRepository categoryRepository;
  private UnitOfMeasureRepository unitOfMeasureRepository;
  
  public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
    this.categoryRepository = categoryRepository;
    this.unitOfMeasureRepository = unitOfMeasureRepository;
  }
  
  @RequestMapping({"","/"})
  public String getIndex() {
  
    Optional<Category> category = categoryRepository.findByCategoryName("Mexican");
    Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepository.findByDescription("Ounce");
  
    System.out.println("Cat ID: " + category.get().getId());
    System.out.println("UoM ID: " + unitOfMeasure.get().getId());
    
    return "index";
  }
}
