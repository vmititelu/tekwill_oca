/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package practice_14_2;

import java.util.ArrayList;
import java.util.function.Predicate;

public class ShoppingCart { 
    ArrayList<Item> items = new ArrayList();
    
    public static void main(String[] args){
        ShoppingCart cart = new ShoppingCart();
        cart.fillCart();
        //cart.removeItemFromCart("Trousers");
        //cart.removeItemFromCart("Shirt");
        cart.removeItemFromCart("Another clothing");

        System.out.println(cart.items);

    }
    
    public void fillCart(){
        items.add(new Shirt(40.95,'M','R'));
        items.add(new Shirt(32.99,'M','Y'));
        items.add(new Trousers(59.99,34,'B',"Relaxed",'M'));
        items.add(new Trousers(75.50,8,'G',"Skinny",'F'));
    }
    
    public void removeItemFromCart(String desc){
        // remove all Trousers from the items list, then print out the list
        items.removeIf(e -> e.getDesc().equals(desc));
        //items.removeIf(e -> e.getDesc().equals("Trousers"));
        
    }
}
  
