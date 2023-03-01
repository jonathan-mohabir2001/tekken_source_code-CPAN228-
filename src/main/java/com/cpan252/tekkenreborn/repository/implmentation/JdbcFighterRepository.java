/*
 * This class now implments the methods from the 
 * created interface. 
 * 
 * 
 */

package com.cpan252.tekkenreborn.repository.implmentation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cpan252.tekkenreborn.model.Fighter;
import com.cpan252.tekkenreborn.repository.FighterRepository;

// import the model, and the Fighter Repository. 
@Repository // indiciate that this is a repository for data access object
public class JdbcFighterRepository implements FighterRepository {
  // implment the Interface

  // Create the methods,but ovveride them.

  private JdbcTemplate jdbcTemplate;

  @Autowired
  public JdbcFighterRepository(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  @Override
  public Iterable<Fighter> findAll() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'findAll'");
  }

  @Override
  public Optional<Fighter> findById(Long id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'findById'");
  }

  @Override
  public Fighter save(Fighter fighter) {
    throw new UnsupportedOperationException("Unimplemented method 'save'");
  }

}
