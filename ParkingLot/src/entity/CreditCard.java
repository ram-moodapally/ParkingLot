package entity;

public class CreditCard extends Payment{
    @Override
    public boolean initiateTransaction() {
        System.out.println("credit card initiated. Always returns true");
        return true;
    }
}
