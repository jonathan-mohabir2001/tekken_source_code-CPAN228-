package com.cpan252.tekkenreborn.controller;

import java.util.EnumSet;

// Spring framework imports
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.cpan252.tekkenreborn.model.Fighter;
import com.cpan252.tekkenreborn.model.Fighter.Anime;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class DesignController {

  @GetMapping("/design")
  public String design(Model model) {
    return "design";
  }

  @ModelAttribute
  public void animes(Model model) {
    var animes = EnumSet.allOf(Anime.class);
    model.addAttribute("animes", animes);
    log.info("animes converted to string:  {}", animes);
  }

  @ModelAttribute
  public Fighter fighter() {
    return Fighter.builder().build();
  }

  @PostMapping("/design")
  public String processFighterAddition(@Valid Fighter fighter, BindingResult result) {
    if (result.hasErrors()) {
      return "design";
    }
    log.info("Processing fighter: {}", fighter);
    return "redirect:/fighterlist";
  }

}
