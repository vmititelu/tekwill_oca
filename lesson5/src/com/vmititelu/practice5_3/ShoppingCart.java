package com.vmititelu.practice5_3;

public class ShoppingCart {
    public static void main(String[] args) {
        String custName = "Mary Smith";
        String message;

        String[] items = new String[4];
        items[0] = "Shirt";
        items[1] = "Belt";
        items[2] = "Scarf";
        items[3] = "Skirt";

        message = custName + " wants to purchase " + items.length + " items.:";
        System.out.println(message);

        //Iterate through and print out the items from the items array
        System.out.println("Items purchased: ");
        for (String item : items){
            System.out.print(item + ", ");
        }

        System.out.println();
        //Afisare tablou cu for clasic
        for (int i = 0; i < items.length; i++) {
            System.out.print(items[i] + " ");

        }

    }
}
