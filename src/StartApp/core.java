/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StartApp;

/**
 *
 * @author vojtechkylar
 */
public class core {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hotel hotel = new Hotel("U Pardubic", 2);
        
        
        System.out.println(hotel.setRooms(new Room[]{
            new Room(1 ,2), new Room(2, 2), new Room(3, 2), new Room(4, 2), new Room(5, 2)})
        );
        
        System.out.println(hotel.addHosts(0, new Host[]{new Host("Pavel", "Nevim"), new Host("Tomáš", "Nevim")}));
        System.out.println(hotel.addHosts(0, new Host[]{new Host("Pavel", "Nevim"), new Host("Tomáš", "Nevim")}));
        System.out.println(hotel.addHosts(0, new Host[]{new Host("Pavel", "Nevim"), new Host("Tomáš", "Nevim")}));
        System.out.println(hotel.addHosts(0, new Host[]{new Host("Pavel", "Nevim"), new Host("Tomáš", "Nevim")}));
        
        
        System.out.println(hotel.toString());
    }
    
    
}
