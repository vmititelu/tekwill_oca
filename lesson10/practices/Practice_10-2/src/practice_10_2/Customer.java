/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package practice_10_2;

public class Customer {
    private String name;
    private String ssn;
   
    //Add a custom constructor
    Customer(String name, String ssn){
        this.name = name;
        this.ssn = ssn;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    
    public String getSSN(){
        return ssn;
    }


}
