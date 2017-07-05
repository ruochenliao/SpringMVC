package spittr.data;

import spittr.Spitter;

public interface SpitterRepository {

  Spitter save(Spitter spitter);
  
  Spitter findByUsername(String username);
  
  Spitter findByUsernameAndPassword(String username, String password);
}
