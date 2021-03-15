package com.ivoronline.springboot_swagger.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

  @ResponseBody
  @RequestMapping("/Hello")
  public String hello(@RequestParam String name, @RequestParam Integer age) {
    return name + " is " + age + " years old";
  }

}
