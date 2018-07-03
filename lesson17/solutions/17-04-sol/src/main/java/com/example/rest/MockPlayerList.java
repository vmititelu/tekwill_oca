/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package com.example.rest;

import java.util.concurrent.CopyOnWriteArrayList;

public class MockPlayerList {
  private static final CopyOnWriteArrayList<Player> pList = new CopyOnWriteArrayList<>();
  
  static {
    // Create list of player database
    
    pList.add(
        new Player(1, "Pelicans", "Dorothy Parker", "F", "9", "USA", 9, 2)
    );
    
    pList.add(
        new Player(2, "Pelicans", "James Joyce", "M", "7", "Ireland", 8, 0)
    );

    pList.add(
        new Player(3, "Magpies", "Emma Orczy", "F", "10", "Hungary", 8, 1)
    );

    pList.add(
        new Player(4, "Hawks", "Charles Dickens", "F", "10", "England", 7, 1)
    );

    pList.add(
        new Player(5, "Robins", "JRR Tolkien", "F", "9", "England", 7, 0)
    );

    pList.add(
        new Player(6, "Pelicans", "William Makepeace", "F", "10", "England", 6, 1)
    );

    pList.add(
        new Player(7, "Magpies", "Sean O'Casey", "M", "8", "Ireland", 6, 0)
    );

    pList.add(
        new Player(8, "Hawks", "James Fenimore Cooper", "D", "2", "USA", 5, 0)
    );

    pList.add(
        new Player(9, "Hawks", "Alexandre Dumas", "M", "6", "France", 5, 2)
    );
  }
  
  private MockPlayerList(){}
  
  public static CopyOnWriteArrayList<Player> getInstance(){
    return pList;
  }
  
}
