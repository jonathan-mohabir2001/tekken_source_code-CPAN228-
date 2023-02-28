/*
 *Home controller file repsonsible for rendering Home.html. 
 */
package com.cpan252.tekkenreborn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
// just like node, import the packaged you want to work with.

@Controller
public class HomeController {

  @GetMapping("/")
  public String home() {
    return ("home.html");
  }
  // public method returning the "home.html"

}
