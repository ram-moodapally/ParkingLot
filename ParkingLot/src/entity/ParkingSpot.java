package entity;

/**
 *
 * Just like Vechile , ParkingSpot must also be abstract, Since there are 4 differnt types of parking spots
 * Like handicapped, compact large and motorcycle
 *
 */

public abstract class ParkingSpot {
    private int id;
    private boolean isFree;
    private Vehicle vehicle;
    public abstract boolean getIsFree();
    public abstract boolean assignVehicle(Vehicle vehicle);
    public abstract boolean removeVehicle();


}
