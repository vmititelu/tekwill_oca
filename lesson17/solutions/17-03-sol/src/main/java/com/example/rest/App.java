package com.example.rest;

import java.util.concurrent.CopyOnWriteArrayList;

public class App 
{
    public static void main( String[] args ){
        CopyOnWriteArrayList<Player> pList = MockPlayerList.getInstance();
        pList.forEach(player -> System.out.println(player));
    }
}
