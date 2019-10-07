package org.sundry.recipes.model;

import com.openpojo.reflection.PojoClass;
import com.openpojo.reflection.impl.PojoClassFactory;
import com.openpojo.validation.Validator;
import com.openpojo.validation.ValidatorBuilder;
import com.openpojo.validation.rule.impl.GetterMustExistRule;
import com.openpojo.validation.rule.impl.SetterMustExistRule;
import com.openpojo.validation.test.impl.GetterTester;
import com.openpojo.validation.test.impl.SetterTester;
import org.junit.Before;
import org.junit.Test;
import org.sundry.recipes.bootstrap.RecipeBootstrap;
import org.sundry.recipes.repositories.RecipeRepository;
import org.sundry.recipes.service.RecipeServiceImpl;

import java.util.stream.Collectors;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;


/**
 * Created by kon1299 on 2019-09-23
 */
public class RecipeTest {
  
  @Test
  public void testGettersSetters() {
    PojoClass pojoClass = PojoClassFactory.getPojoClass(Recipe.class);
    Validator validator = ValidatorBuilder
            .create()
            .with(new SetterMustExistRule())
            .with(new GetterMustExistRule())
            .with(new SetterTester())
            .with(new GetterTester())
            .build();
    
    validator.validate(pojoClass);
  }
}