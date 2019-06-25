package org.sundry.recipes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by kon1299 on 2019-03-19
 */
@Controller
public class IndexController {
  
  @RequestMapping({"","/"})
  public String getIndex() {
    return "index";
  }
}
