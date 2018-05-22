/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package practice_08_2;

public class ShoppingCart {
    public static void main (String[] args){
        Item item1 = new Item();
        
        // Call the 3-arg setItemFields method and then call displayItem.
        item1.setItemFields("Belt", 1, 29.50);
        item1.displayItem();

        // Call the 4-arg setItemFields method, checking the return value.
        int retcode = item1.setItemFields("Shirt", 1, 34.99, ' ');
        if (retcode < 0) {
            System.out.println("Invalid color code.  Item not added.");
        } 
        else {
            item1.displayItem();
        }
    } 
}    
