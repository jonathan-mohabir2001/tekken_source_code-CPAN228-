package com.cpan252.tekkenreborn.controller;

import java.util.EnumSet;
// util api call to use EnumSet class

//SPRING framework imports
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cpan252.tekkenreborn.model.Fighter;
// importing the created Fighter model 

import com.cpan252.tekkenreborn.model.Fighter.Anime;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@Controller // this is responsible for handling the request and response, so its a
            // controller
@Slf4j
@RequestMapping("/design") // defined the route url location for this controller
public class DesignController {

  @GetMapping
  public String design() {
    return "design";
  }

  @ModelAttribute
  public void animes(Model model) {
    var animes = EnumSet.allOf(Anime.class);
    model.addAttribute("animes", animes);
    log.info("animes converted to string:  {}", animes);
  }

  @ModelAttribute
  // This model attribute has a lifetime of a request
  public Fighter fighter() {
    return Fighter
        .builder()
        .build();
  }

}
