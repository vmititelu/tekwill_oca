/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package practice_08_1;

public class ShoppingCart {
    public static void main(String[] args) {
        Item item1 = new Item();
        
        // Call the setColor method on item1.
        char color = ' ';
        boolean isColor = item1.setColor(color);
        // Print an appropriate message, depending upon the return value.
        if (isColor)
            System.out.println("Culoarea \"" + color + "\" a fost setata");
        else
            System.out.println("Culoarea \"" + color + "\" nu a fost setata");

        color = 'r';
        isColor = item1.setColor(color);
        // Print an appropriate message, depending upon the return value.
        if (isColor)
            System.out.println("Culoarea \"" + color + "\" a fost setata");
        else
            System.out.println("Culoarea \"" + color + "\" nu a fost setata");


    }
}