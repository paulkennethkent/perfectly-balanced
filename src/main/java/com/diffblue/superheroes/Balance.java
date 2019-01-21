package com.diffblue.superheroes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Balance {

  public enum Superheroes {
    THOR, CPTAMERICA, IRONMAN, SPIDERMAN, DRSTRANGE, HULK, BLACKWIDOW, HAWKEYE
  }

  /**  The end is near. */
  public static void main(String[] args) {
    Balance superheroes = new Balance();
    List<Superheroes> superheroesList = superheroes.perfectlyBalanced();
    System.out.println(superheroesList.toString());
  }

  /** Avengers Assemble.*/
  private List assemble() {
    List<Superheroes> list = Arrays.asList(Superheroes.values());
    return list;
  }

  /** When I’m done, half of humanity will still exist.
   * Perfectly balanced, as all things should be. I hope they remember you. */
  private int snap(List avengers) {
    System.out.println("SNAP " + avengers.size());
    int rnd = new Random().nextInt(avengers.size());
    return rnd;
  }

  /** Fun isn’t something one considers when balancing the universe.
   * But this… does put a smile on my face. */
  public List<Superheroes> perfectlyBalanced() {
    List<Superheroes> avengers =  new ArrayList<Superheroes>(assemble());
    int teamsize = avengers.size();
    int balancedUniverse = teamsize / 2;
    while (teamsize != balancedUniverse) {
      int random = snap(avengers);
      avengers.remove(random);
      teamsize = avengers.size();
    }
    return avengers;
  }
}
