/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package soccer;

public class Team implements Comparable {
    private String teamName;
    private Player[] playerArray;
    private int pointsTotal;
    private int goalsTotal;
    
    //Constructors
    public Team(String teamName, Player[] players) {
        this(teamName);
        this.playerArray = players;
    }
    public Team(String teamName) {
        this.teamName = teamName;
    }
    
    //Methods
    public void incGoalsTotal(int goals){
        this.setGoalsTotal(this.getGoalsTotal() + goals);
    }
    public void incPointsTotal(int points){
        this.pointsTotal += points;
    }
    public int compareTo(Object theTeam){
        int returnValue = -1;
        if (this.getPointsTotal()< ((Team)theTeam).getPointsTotal()) {
            returnValue = 1;
        } else if (this.getPointsTotal() == ((Team)theTeam).getPointsTotal()){
            if (this.getGoalsTotal()< ((Team)theTeam).getGoalsTotal()) {
                returnValue = 1;
            } 
        }
        return returnValue;
    }
    
    //Getters and Setters
    public String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Player[] getPlayerArray() {
        return playerArray;
    }
    public void setPlayerArray(Player[] playerArray) {
        this.playerArray = playerArray;
    }
    
    public int getPointsTotal() {
        return pointsTotal;
    }
    public void setPointsTotal(int pointsTotal) {
        this.pointsTotal = pointsTotal;
    }

    public int getGoalsTotal() {
        return goalsTotal;
    }
    public void setGoalsTotal(int goalsTotal) {
        this.goalsTotal = goalsTotal;
    }

}
