/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package practice_15_1;

public class Calculator {
    public int add(int x, int y){
        return x + y;
    }
    // This method could throw an ArithmeticException
    public double divide(int x, int y){
        try{
            return x / y;
        }catch (ArithmeticException e){
            System.err.println(e.getMessage());
            return 0;
        }
    }
}
