/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Control.CharacterControl;
import Control.ItemControl;
import Control.LocationControl;
import java.io.Serializable;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Robbie
 */
public class Game implements Serializable {
    
    
    private Player player;
    private Person person;
    private int enemiesKilled;
    private LocalTime time;
    private Map map;
    private ArrayList<Item> itemGameList;
     private ArrayList<Character> enemies;
     
     private final Room[] roomTypes;
     
        public Game() {
            player = null;
            person = null;
            map = null;
            itemGameList = new ArrayList<>();
            enemies = new ArrayList<>();
            
            roomTypes = new Room[5];
            
            roomTypes[0].setDescription(null);
            
            
            
    }

    public ArrayList<Item> getitemGameList() {
        return itemGameList;
    }

    public void setitemGameList(ArrayList<Item> itemGameList) {
        this.itemGameList = itemGameList;
    }

    public ArrayList<Character> getEnemies() {
        return enemies;
    }

    public void setEnemies(ArrayList<Character> enemies) {
        this.enemies = enemies;
    }

    
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    
    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public int getEnemiesKilled() {
        return enemiesKilled;
    }

    public void setEnemiesKilled(int enemiesKilled) {
        this.enemiesKilled = enemiesKilled;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }
    
    public void initializeElements(Player player)
    {
        
        
        ItemControl itemControl = new ItemControl();
       
        // set location for player to start location
        
        // each element will be set to a random location after player
        // generate random numbers 
        LocationControl locationControl = new LocationControl();
        // Adding Items
        itemGameList.add(itemControl.newItem("A light-weight Sword", 4, 'w', LocationControl.generateRandomLocation()));
        itemGameList.add(itemControl.newItem("A rusty old rifle", 5, 'w', LocationControl.generateRandomLocation()));
        itemGameList.add(itemControl.newItem("A sexy shotgun", 7, 'w', LocationControl.generateRandomLocation()));
        itemGameList.add(itemControl.newItem("A friggen Katana", 10, 'w', LocationControl.generateRandomLocation()));
        itemGameList.add(itemControl.newItem("A flame-thrower", 10, 'w', LocationControl.generateRandomLocation()));
        
        CharacterControl characterControl = new CharacterControl();
        // Adding Enemies
        for(int i = 0; i < 4; i++)
        {
        enemies.add(characterControl.generateRandomEnemy());
        }
        
        // Add clues
        itemGameList.add(itemControl.newItem("wklv lv d vhfuhw phvvdjh", 0, 'c', LocationControl.generateRandomLocation()));
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.enemiesKilled;
        hash = 37 * hash + Objects.hashCode(this.time);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (this.enemiesKilled != other.enemiesKilled) {
            return false;
        }
        if (!Objects.equals(this.time, other.time)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "enemiesKilled=" + enemiesKilled + ", time=" + time + '}';
    }
    
    
    
}
