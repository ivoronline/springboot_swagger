package com.ivoronline.springboot_swagger.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@EnableSwagger2
public class MyController {

  //=========================================================================
  // ONE METHOD
  //=========================================================================
  @RequestMapping("Hello")
    String hello(
      @RequestParam String  name,
      @RequestParam Integer age
  ) {
    return name + " is " + age + " years old";
  }

  //=========================================================================
  // ONE METHODS
  //=========================================================================
  @GetMapping("OneMethod")
  String oneMethod(
    @RequestParam String  name,
    @RequestParam Integer age
  ) {
    return name + " is " + age + " years old";
  }

  //=========================================================================
  // TWO METHODS
  //=========================================================================
  @RequestMapping(value="TwoMethods", method = { RequestMethod.GET, RequestMethod.POST })
  String twoMethods(
    @RequestParam String  name,
    @RequestParam Integer age
  ) {
    return name + " is " + age + " years old";
  }


}


