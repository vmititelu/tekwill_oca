/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package practice_13_3;

public class Shirt extends Item {
    private char size;
    private char colorCode;
    
    public Shirt(double price, char size, char colorCode){
        super ("Shirt", price);
        this.size = size;
        this.colorCode = colorCode;
    } 
    
    public void display(){
        super.display();
        System.out.println("\tSize: " +size);
        System.out.println("\tColor Code: " +colorCode);
    }
    
    // Code a public getColor method that converts the colorCode to a the color name.
    // Use a switch statement.  Return the color name.
    public String getColor(){
        String color = "";
        switch (colorCode){
            case 'R': color = "Red"; break;
            case 'G': color = "Green"; break;
            case 'Y': color = "Yellow"; break;
        }
        return color;
    }
}

