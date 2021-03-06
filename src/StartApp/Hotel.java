/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StartApp;

import java.util.Arrays;



/**
 *
 * @author vojtechkylar
 */
public class Hotel {
    final String name;
    int capacity;
    private Room[] rooms;
    Host[] hosts;

    public Hotel(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
    public Hotel(String name, int capacity, Room[] rooms) {
        this.name = name;
        this.capacity = capacity;
        this.rooms = rooms;
    }
    
    public String setRooms(Room[] rooms){
        String s = "";
        if (rooms.length <= capacity) {
            this.rooms = rooms;
            s = "Pokoje přidány";
        }else{
            s+="Nedostatečná kapacita";
        }
        
        
        return s;
    }
    public String addHosts(int index, Host[] hosts){
        String s = "";
        if (rooms != null) {
            for (int i = 0; i < rooms.length; i++) {
                Room room = rooms[i];
                
                if (room.isOccupied() || room.getCapacity()<hosts.length){
                    
                    if (i == rooms.length-1){
                    s+= "Nejsou žádné volné pokoje";
                    continue;
                    }
                   
                }else{
                    s+=this.rooms[i].setHosts(hosts);
                    break;
                }
            }
        }else{
            s+= "nejsou žádné pokoje";
        }
            
        
        
        
        return s;
    }

    @Override
    public String toString() {
        return "Hotel{" + "name=" + name + ", capacity=" + capacity + ", rooms=" + Arrays.deepToString(rooms) + ", hosts=" + Arrays.toString(hosts) + '}';
    }
    
    
}
