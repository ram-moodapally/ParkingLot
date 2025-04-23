package entity;

import constants.AccountStatus;

import java.sql.Date;
import java.sql.Time;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ParkingTicket {
    private LocalTime entryTime;
    private String licenseNo;
    private Date timeStamp;
    private double amount;
    private AccountStatus accountStatus; // Enum
    // instaces of the respective classes
    private Vehicle vehicle;
    private Entrance entrace; // todo create entrace
    private Exit exit;  // to create exit
    private Payment payment;

    public ParkingTicket(LocalTime entryTime, String licenseNo, Date timeStamp, double amount, AccountStatus accountStatus, Vehicle vehicle, Entrance entrace, Exit exit, Payment payment) {
        this.entryTime = entryTime;
        this.licenseNo = licenseNo;
        this.timeStamp = timeStamp;
        this.amount = amount;
        this.accountStatus = accountStatus;
        this.vehicle = vehicle;
        this.entrace = entrace;
        this.exit = exit;
        this.payment = payment;
    }

    public Duration calculateDuration() {
        return Duration.between(entryTime, LocalTime.now());
    }

}
