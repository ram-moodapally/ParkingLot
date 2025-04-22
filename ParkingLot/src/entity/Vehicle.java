package entity;

/**
 * an Abstract class cannot instantiate the boject and can only be used as a base class.
 * the abstract class for Vehicld is best approach. it allows us to create derived child clases for Vehicle class. It
 * can be extended easily in case of vechile type changes in future.
 *
 *
 * One of the requirement
 */

public abstract class Vehicle {
    String plateNumber;
    int id;
    String color;

    public abstract void assignTicket(ParkingTicket ticket);
}
