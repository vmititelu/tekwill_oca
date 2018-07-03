/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package com.example.rest;

public class Player {
  private final long id;
  private final String team;
  private final String name;
  private final String position;
  private final String number;
  private final String country;
  private final long goals;
  private final long yellowCards;
  
  public Player(){
      super();
      id = 0;
      team = "";
      name = "";
      position = "";
      number = "";
      country = "";
      goals = 0;
      yellowCards = 0;
  }
   
  public Player(long id, String team, String name, String position, String number, String country, long goals, long yellowCards){
      this.id = id;
      this.team = team;
      this.name = name;
      this.position = position;
      this.number = number;
      this.country = country;
      this.goals = goals;
      this.yellowCards = yellowCards;
  }
  
  public long getId(){
    return this.id;
  }

  public String getTeam() {
    return this.team;
  }

  public String getName() {
    return this.name;
  }
  
  public String getPosition(){
      return this.position;
  }
  
  public String getNumber(){
    return this.number;
  }

  public String getCountry() {
    return this.country;
  }

  public long getGoals() {
    return this.goals;
  } 
  
  public long getYellowCards(){
    return this.yellowCards;
  }
  
  @Override
  public String toString(){
    return "ID: " + id 
        + " Team: " + team
        + " Name: " + name
        + " Position: " + position
        + " Number: " + number
        + " Country: " + country
        + " Goals: " + goals
        + " Yellow Cards: " + yellowCards;
  }  
  
}
