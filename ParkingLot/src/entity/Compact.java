package entity;

public class Compact extends ParkingSpot{
    @Override
    public boolean getIsFree() {
        return false;
    }

    @Override
    public boolean assignVehicle(Vehicle vehicle) {
        return false;
    }

    @Override
    public boolean removeVehicle() {
        return false;
    }
}
