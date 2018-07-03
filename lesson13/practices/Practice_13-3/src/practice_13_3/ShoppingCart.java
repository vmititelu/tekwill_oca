/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package practice_13_3;

public class ShoppingCart {
    public static void main(String args[]){ 
        // Declare and instantiate a Shirt object using an Item reference type instead
        Shirt shirt1 = new Shirt(25.99, 'M', 'R');
        Item shirt2 = new Shirt(25.99, 'M', 'Y');
        Item shirt3 = new Item("Not Shirt", 25.99);
        // Call the display method on the object, then the getColor method
        shirt1.display();
        shirt2.display();
        shirt3.display();

        if (shirt1 instanceof Shirt){
            String color = ((Shirt)shirt1).getColor();
            System.out.println("Shirt1 is a shirt with color " + color);
        }else{
            System.out.println("Shirt1 is not a Shirt");
        }

        if (shirt2 instanceof Shirt){
            String color = ((Shirt)shirt2).getColor();
            System.out.println("Shirt2 is a shirt with color " + color);
        }else{
            System.out.println("Shirt2 is not a Shirt");
        }

        if (shirt3 instanceof Shirt){
            String color = ((Shirt)shirt1).getColor();
            System.out.println("Shirt3 is a shirt with color " + color);
        }else{
            System.out.println("Shirt3 is not a Shirt");
        }


    }
}    
