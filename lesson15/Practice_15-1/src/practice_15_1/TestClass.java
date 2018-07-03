/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package practice_15_1;

public class TestClass {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int addResult = calc.add(43, 79);
        System.out.println("Add Result: " + addResult);
        
        // Add exception handling to catch ArithmeticException
        try {
            double divResult = calc.divide(15, 0);
            System.out.println("Division Result: " + divResult);
        }/*catch (ArithmeticException e){
            System.err.println(e.getMessage());
        }*/catch (MyZeroException e){
            System.err.println("My Own Exc " + e.getMessage());
        }
    }    
}
