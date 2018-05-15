/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package practice_07_2;

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

        //Instantiate and initialize sb to firstName.
        StringBuilder sb = new StringBuilder(firstName);


        // Put the full name back together, using StringBuilder append method.
        // You can just enter the String literal for the last name.
        // Print the full name.

        StringBuilder sb2 = new StringBuilder(sb);
        sb.append(" Smith");
        System.out.println("sb = " + sb);

        // (Optional) Can you append the last name without using a String literal?
        String lastName = custName.substring(spaceIdx);
        sb2.append(lastName);
        System.out.println("sb2 = " + sb2);



    }
}
