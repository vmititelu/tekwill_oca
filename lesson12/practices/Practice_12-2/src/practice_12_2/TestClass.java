/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package practice_12_2;

public class TestClass {
    public static void main(String[] args) {
        String name;
        int age;

        // Parse the args array to populate name and age.
        // Print an error message if fewer than 2 args are passed in.
        if (args.length < 2){
            System.out.println("Error! Args are mai putin de 2 argumente!");
        }else{
            name = args[0];
            age = Integer.parseInt(args[1]);
            System.out.println(name +" are " + age + " ani, ioprst!");
        }
    }    
}
