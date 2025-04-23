package entity;

public class StripPayment extends Payment{

    @Override
    public boolean initiateTransaction() {
        // initiate stripe payment

        return false;
    }
}
