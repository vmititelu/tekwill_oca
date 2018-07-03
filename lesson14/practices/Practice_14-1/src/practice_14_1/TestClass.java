/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package practice_14_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class TestClass {
    public static void main(String[] args) {
        String[] days = {"Luni","monday","saturday","tuesday","sunday","friday", "Luni"};

        // Convert the days array into an ArrayList

        List <String> list = Arrays.asList(days);
        ArrayList<String> arrayList = new ArrayList<>(list);

        // Loop through the ArrayList, printing out "sunday" elements in 
        //   upper case (use toUpperCase() method of String class) 
        // Print all other days in lower case 
        // Print out the ArrayList

        for (String s: arrayList){
            if (s.equals("sunday")){
                System.out.println(s.toUpperCase());
            }else{
                System.out.println(s.toLowerCase());
            }
        }

        arrayList.replaceAll(x -> x.toUpperCase());
        System.out.println(arrayList);

        UnaryOperator<String> x1 = x->x.toUpperCase() + x.toLowerCase();
        arrayList.replaceAll(x1);
        System.out.println(arrayList);

        List<String> l = arrayList.stream().map(x ->x.equals("sunday")?x.toUpperCase():x.toLowerCase()).collect(Collectors.toList());
        List<String> filteredList = arrayList.stream().filter(x ->x.contains("s")).collect(Collectors.toList());
        String reducedList = arrayList.stream().reduce((x, acc) -> acc += x).get();

        System.out.println("Lista cu 'SUNDAY' este : " + l);
        System.out.println("Liksta filtrata este: " + filteredList);
        System.out.println("Lista redusa este: " + reducedList);
        //arrayList.removeIf(e -> e.equals("LUNI"));
        //System.out.println(arrayList);
        arrayList.remove("LUNI");
        System.out.println(arrayList);

        /*Iterator it = arrayList.iterator();
        while(it.hasNext()){
            if (it.next().equals("sunday")){
                System.out.println(it.next());//.toLowerCase());
            }
        }*/

    }    
}
