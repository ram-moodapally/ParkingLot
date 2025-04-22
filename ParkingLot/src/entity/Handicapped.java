package entity;

public class Handicapped extends ParkingSpot{

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
