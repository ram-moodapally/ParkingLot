package services;

import entity.DiscountRate;
import entity.PricingStrategy;
import entity.ParkingTicket;
import entity.Payment;

import java.util.Objects;

public class PaymentSerice {
    private ParkingTicket parkingTicket;
    private PricingStrategy strategy;
    private Payment payment;

    PricingStrategy discountRate = DiscountRate.getInstance();
    // similarly HourlyRating (skpped)

    // constructor
    public PaymentSerice(ParkingTicket parkingTicket, PricingStrategy strategy, Payment payment) {
        this.parkingTicket = parkingTicket;
        this.strategy = strategy;
        this.payment = payment;
    }

    public double calculatePrice(ParkingTicket ticket, PricingStrategy pricingStrategy){
        return pricingStrategy.calculate(ticket);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaymentSerice that = (PaymentSerice) o;
        return Objects.equals(parkingTicket, that.parkingTicket) && Objects.equals(strategy, that.strategy) && Objects.equals(payment, that.payment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parkingTicket, strategy, payment);
    }
}
