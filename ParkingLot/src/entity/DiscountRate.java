package entity;

public class DiscountRate implements PricingStrategy {
    private static DiscountRate instance = null;
    private DiscountRate(){

    }
    public static DiscountRate getInstance(){
        if( instance == null){
            instance =  new DiscountRate();
        }
        return instance;
    }
    @Override
    public double calculate(ParkingTicket ticket ){

        return ticket.calculateDuration().toHours()*10; // here we can also modularize 10 to some production level.
    }
}
