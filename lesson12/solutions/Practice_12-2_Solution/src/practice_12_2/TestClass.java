/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package practice_12_2;

public class TestClass {
    public static void main(String[] args) {
        String name;
        int age;

        // Parse the args array to populate name and age.  
	// Print an error message if fewer than 2 args are passed in.
        if (args.length < 2) {
            System.out.println("Invalid arg list.  There must be 2 arguments");
        } 
        else {
            name = args[0];
            age = Integer.parseInt(args[1]);
            System.out.println("Name = "+name+", Age = "+age);
        }
    }    
}
