/*
 * Interface representing the Fighter for findingAll, findById and saving to the 
 * database 
 * 
 * An interface defines a set of methods that are implmented by other classes. 
 */

package com.cpan252.tekkenreborn.repository;

import java.util.Optional;
//represent a value that may or may not be present.
import com.cpan252.tekkenreborn.model.Fighter;
// import the model 

public interface FighterRepository {

  Iterable<Fighter> findAll();
  // get all of the fighters

  Optional<Fighter> findById(Long id);
  // find by their created ID

  Fighter save(Fighter fighter);
  // save the fighter into the Database
}
