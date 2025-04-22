package entity;

public class Cash extends Payment{
    @Override
    public boolean initiateTransaction() {
        System.out.println(" cash transaction initiated. ");
        return false;
    }
}
