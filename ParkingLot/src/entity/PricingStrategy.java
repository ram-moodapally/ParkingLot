package entity;

/**
 *
 * Here we can also so Money( corrency)  instead of double
 */
public interface PricingStrategy {
    double calculate(ParkingTicket ticket);
}
