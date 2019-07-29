package org.sundry.recipes.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.sundry.recipes.service.RecipeService;

/**
 * Created by kon1299 on 2019-03-19
 */
@Slf4j
@Controller
public class IndexController {
  
  private final RecipeService recipeService;
  
  public IndexController(RecipeService recipeService) {
    log.debug("On the controller's constructor");
    this.recipeService = recipeService;
  }
  
  @RequestMapping({"","/"})
  public String getIndex(Model model) {
    model.addAttribute("recipes", recipeService.getRecipes());
    log.debug("Returning recipes to web UI");
    return "index";
  }
}
