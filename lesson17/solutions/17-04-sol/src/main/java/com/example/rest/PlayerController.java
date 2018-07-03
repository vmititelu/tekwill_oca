/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package com.example.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/players")
public class PlayerController {

    private final CopyOnWriteArrayList<Player> pList = MockPlayerList.getInstance();

    // Get all players
    @RequestMapping(method = RequestMethod.GET)
    public Player[] getAll() {
        return pList.toArray(new Player[0]);
    }

    // Get a player
    @RequestMapping(method = RequestMethod.GET, value = "{id}")
    public Player get(@PathVariable long id) {
        
        Player match = null;
        
        for(Player p:pList){
            if (p.getId() == id){
                match = p;
            }  
        }
        
        if (match != null){
            return match;
        } else {
            throw new NotFoundException(id + " not found");            
        }                

    }

    // Get players by country
    @RequestMapping(method = RequestMethod.GET, value = "/country/{name}")
    public Player[] getByCountry(@PathVariable String name) {
        
        List<Player> matchList = new ArrayList<>();
        
        for(Player p:pList){
            if (p.getCountry().equals(name)){
                matchList.add(p);
            }  
        }
        
        if (matchList.size() > 0){
            return matchList.toArray(new Player[0]);
        } else {
            throw new NotFoundException(name + " not found");            
        }                

    }


    // Get players by goals
    @RequestMapping(method = RequestMethod.GET, value = "/goals/{goalCount}")
    public Player[] getByGoals(@PathVariable long goalCount) {
        
        List<Player> matchList = new ArrayList<>();
        
        for(Player p:pList){
            if (p.getGoals() >= goalCount){
                matchList.add(p);
            }  
        }
        
        if (matchList.size() > 0){
            return matchList.toArray(new Player[0]);
        } else {
            throw new NotFoundException(goalCount + " not found");            
        }                

    }

    
    
    // Add a player
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity add(@RequestBody Player player) {
        pList.add(player);
        return new ResponseEntity<>(null, HttpStatus.CREATED);
    }
 
    
    // Update a player
    @RequestMapping(method = RequestMethod.PUT, value = "{id}")
    public ResponseEntity update(@PathVariable long id, @RequestBody Player player) {
        
        int matchIndex = -1;
        
        for(Player p:pList){
            if (p.getId() == id){
                matchIndex = pList.indexOf(p);
            }  
        }
        
        if (matchIndex > -1){
            pList.set(matchIndex, player);
            return new ResponseEntity<>(null, HttpStatus.OK);           
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);           
        }                
   }
   

    // Delete a player
    @RequestMapping(method = RequestMethod.DELETE, value = "{id}")
    public ResponseEntity delete(@PathVariable long id) {
        
        int matchIndex = -1;
        
        for(Player p:pList){
            if (p.getId() == id){
                matchIndex = pList.indexOf(p);
            }  
        }
        
        if (matchIndex > -1){
            pList.remove(matchIndex);
            return new ResponseEntity<>(null, HttpStatus.OK);           
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);           
        }                
    }
    
    
    // Throw this exception when a lookup fails
    @ExceptionHandler(NotFoundException.class)
    @ResponseBody
    public ResponseEntity<?> myError(Exception exception) {
        return new ResponseEntity<>(new JsonError("Not found error:", exception.getMessage()), HttpStatus.NOT_FOUND);
    }
    

}
