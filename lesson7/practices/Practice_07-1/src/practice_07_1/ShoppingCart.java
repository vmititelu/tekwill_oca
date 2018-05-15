/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package practice_07_1;

public class ShoppingCart {
    public static void main(String[] args) {
        String custName = "Steve Smith";
        String firstName;
        int spaceIdx;

        // Get the index of the space character (" ") in custName.

        spaceIdx = custName.indexOf(' ');

        // Use the substring method to parse out the first name and print it.
        firstName = custName.substring(0, spaceIdx);
        System.out.println("The first name is: " + firstName);

    }
}