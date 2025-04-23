package services;

import constants.AccountStatus;
import entity.*;

import java.util.HashMap;

public class ParkingLot {

    private int id;
    private String name;
    private String address;
    private ParkingRate parkingRate;

    private HashMap<String, Entrance> entrance;
    private HashMap<String, Exit> exit;
    private PricingStrategy pricingStrategy;
    private PaymentService paymentService;
    private static Vehicle vehicle;

    // create a hashmap that identifies all currently generated tickets using their ticket number

    private HashMap<String, ParkingTicket> tickets;

    private static ParkingLot parkingLot = null;

    private ParkingLot(){

    }

    private static ParkingLot getInstance(){
        if(parkingLot  == null){
            parkingLot = new ParkingLot();
        }
        return parkingLot;
    }

    public boolean addEntrane(Entrance entrace){
        return false;
    }
    public boolean addExit(Exit exit){
        return false;
    }

    // this function allows parking tickets to be available at multiple entrances

    public ParkingTicket getParkingTicket(Vehicle vehicle) {
        return null;
    }
    public AccountStatus makePayment(){
        double amountPaid = paymentService.calculatePrice(getParkingTicket(vehicle),pricingStrategy );
        if(amountPaid == 0.0){
            return AccountStatus.FAILED;
        }
        return AccountStatus.COMPLETED;
    }
    public boolean isFull(ParkingSpot type){
        return false;
    }



}
