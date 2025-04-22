package entity;

import constants.AccountStatus;

import java.sql.Date;
import java.sql.Time;

public class ParkingTicket {
    private Time entryTime;
    private String licenseNo;
    private Date timeStamp;
    private double amount;
    private AccountStatus accountStatus; // Enum
    // instaces of the respective classes
    private Vehicle vehicle;
    private Entrance entrace; // todo create entrace
    private Exit exit;  // to create exit
    private Payment payment;


}
