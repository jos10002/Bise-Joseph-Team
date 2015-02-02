/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Robbie
 */
public class Location implements Serializable{
    private Coordinates mapCoords;
    private Coordinates roomCoords;
    private Room room;


    public Location() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.mapCoords);
        hash = 53 * hash + Objects.hashCode(this.roomCoords);
        hash = 53 * hash + Objects.hashCode(this.room);
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
        final Location other = (Location) obj;
        if (!Objects.equals(this.mapCoords, other.mapCoords)) {
            return false;
        }
        if (!Objects.equals(this.roomCoords, other.roomCoords)) {
            return false;
        }
        if (!Objects.equals(this.room, other.room)) {
            return false;
        }
        return true;
    }



    @Override
    public String toString() {
        return "Location{" + "mapCoords=" + mapCoords + ", roomCoords=" + roomCoords + '}';
    }

    
    
    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
    
    public Coordinates getMapCoords() {
        return mapCoords;
    }

    public void setMapCoords(Coordinates mapCoords) {
        this.mapCoords = mapCoords;
    }

    public Coordinates getRoomCoords() {
        return roomCoords;
    }

    public void setRoomCoords(Coordinates roomCoords) {
        this.roomCoords = roomCoords;
    }
    
    
    
    
}
