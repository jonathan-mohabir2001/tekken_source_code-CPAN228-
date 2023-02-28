package com.cpan252.tekkenreborn.model;

import java.math.BigDecimal;

import lombok.*;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

@Data
// lombok annotation to generate getters and setters
@Builder
// lombok annotation to generate builder pattern
public class Fighter {

  private String name;

  @Max(100)
  private int damagePerHit;// damage capped at 100

  @Min(1000) // health at minimum 1000
  private int health;

  @DecimalMin(value = "0.1", inclusive = true) // minmum resistance is 0.1 and inclusive
  @DecimalMax(value = "10.0", inclusive = true) // max resistance is 10 and inclusive
  private BigDecimal resistance;
  // resistance value set to be in between 0.1 and 10

  private Anime animeFrom;// this will be an enum of different anime
  // make the anime enum

  public enum Anime {
    NARUTO("Naruto"), BLEACH("Bleach"), ONE_PIECE("One Piece"), TEKKEN("Tekken");

    private String title;

    private Anime(String title) {
      this.title = title;
    }

    public String getTitle() {
      return title;
    }
  }

}