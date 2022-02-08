package StartApp;

import java.util.Arrays;

/**
 *
 * @author vojtechkylar
 */
public class Room {

    int index;
    int capacity;
    private boolean Occupied;
    private Host[] hosts;

    public Room(int index, int capacity) {
        this.index = index;
        this.capacity = capacity;
    }

    public Room(int index, int capacity, Host[] hosts) {
        this.index = index;
        this.capacity = capacity;
        this.hosts = hosts;
    }

    public String setHosts(Host[] hosts) {
        String s = "";
        if (isOccupied()) {
            s += "Pokoj je obsazen";
        } else {
            if (hosts.length <= capacity) {
                this.hosts = hosts;
                setIsOccupied(true);
                s+= "Hosté byli ubytováni";
            } else {
                s += "nedostatečné místo";
            }
        }

        return s;
    }

    public Host[] getHosts() {
        return hosts;
    }

    public void setIsOccupied(boolean isOccupied) {
        this.Occupied = isOccupied;
    }

    public boolean isOccupied() {
        return Occupied;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Room{" + "index=" + index + ", capacity=" + capacity + ", Occupied=" + Occupied + ", hosts=" + Arrays.toString(hosts) + '}';
    }
    
    
    
}


