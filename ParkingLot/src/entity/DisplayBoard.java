package entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DisplayBoard {
    /*
    I didn't understand this what is there in this?
     */

    private int id;
    private Map<String, List<ParkingSpot>> parkingSpots;

    public DisplayBoard(int id){
        this.id = id;
        this.parkingSpots = new HashMap<>();
    }

    public void addParkingSpots(String spotType, List<ParkingSpot> spots) {

    }

    public void showFreeSlot(){

    }
}
