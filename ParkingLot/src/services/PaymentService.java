package services;

import entity.DiscountRate;
import entity.PricingStrategy;
import entity.ParkingTicket;
import entity.Payment;

import java.util.Objects;

public class PaymentService {
    private static ParkingTicket parkingTicket;
    private static PricingStrategy strategy;
    private static Payment payment;
    private static PaymentService instance = null;

    PricingStrategy discountRate = DiscountRate.getInstance();
    // similarly HourlyRating (skpped)

    // constructor
    private PaymentService(ParkingTicket parkingTicket, PricingStrategy strategy, Payment payment) {
        this.parkingTicket = parkingTicket;
        this.strategy = strategy;
        this.payment = payment;
    }

    public double calculatePrice(ParkingTicket ticket, PricingStrategy pricingStrategy){
        return pricingStrategy.calculate(ticket);
    }

    // Lazy initialization
    public static PaymentService getInstance(){
        if(instance == null){
            instance = new PaymentService(parkingTicket,strategy,payment);
        }
        return instance;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaymentService that = (PaymentService) o;
        return Objects.equals(parkingTicket, that.parkingTicket) && Objects.equals(strategy, that.strategy) && Objects.equals(payment, that.payment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parkingTicket, strategy, payment);
    }
}
