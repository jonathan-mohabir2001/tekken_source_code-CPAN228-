package com.cpan252.tekkenreborn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
// import the needed modules  

@Controller
// annotate the class to indicate its a controller
public class AboutController {
  @GetMapping("/about")
  // annotate method and assign route url location
  public String about() {
    return ("about");
  }
  // defined the method to return about
}
