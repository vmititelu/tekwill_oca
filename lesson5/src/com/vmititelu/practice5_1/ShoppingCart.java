package com.vmititelu.practice5_1;

public class ShoppingCart {
    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "Shirt";
        String message;

        double price = 29.99;
        int quantity = 2;
        double tax = 1.04;
        double total;

        message = custName + " wants to purchase " + quantity + " " + itemDesc;
        total = quantity * price * tax;

        //Test quantity and modify message if quantity > 1
        if (quantity > 1){
            message = message + "s";
        }

        //Declare outOfStock variable and initialize it
        boolean outOfStock = false;

        //Test outOfStock and notify user in either case
        if (outOfStock){
            System.out.println(itemDesc + " is out of stock.");
        }else {
            System.out.println(message);
            System.out.println("Total cost with tax: " + total);
        }


        /*int age = 25;
        if (age > 16) {
            System.out.println("Adult");
        } else {
            System.out.println("Adolescent");
        }*/

        if (1 == 1.0){
            System.out.println("Egale!");
        }else{
            System.out.println("Diferite!");
        }

    }

}
