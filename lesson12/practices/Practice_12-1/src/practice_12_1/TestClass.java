/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package practice_12_1;

// import statements here:
//import java.time.LocalDate;
import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Arrays;

public class TestClass {
    public static void main(String[] args) {
        // Declare a LocalDateTime object, orderDate
        LocalDateTime orderDate;
        
	// Initialize the orderDate to the current date and time. Print it.
        orderDate = LocalDateTime.now();
        System.out.println(orderDate);

	// Format orderDate using ISO_LOCAL_DATE; Print it.
        String sdate = orderDate.format(DateTimeFormatter.ISO_DATE_TIME);
        //System.out.println(orderDate);
        System.out.println(sdate);

        String fdate = orderDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println(fdate);

        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(Arrays.toString(args));

    }    
}
