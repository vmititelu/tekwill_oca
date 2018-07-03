/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package practice_13_2;

public class Shirt extends Item {
    private char size;
    private char colorCode;
    
    public Shirt(double price, char size, char colorCode){
        super ("Shirt", price);
        this.size = size;
        this.colorCode = colorCode;
    } 
    
    // Override display() in the superclass to also show size and colorCode.

    @Override
    public void display() {
        super.display();
        System.out.println("\tSize: " + size);
        System.out.println("\tColor code: " + colorCode);
    }

    // Avoid duplicating code.
    
}
