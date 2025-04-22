package entity;

import constants.AccountStatus;

import java.sql.Date;

public abstract class Payment {
    private double amount;
    private AccountStatus status;
    private Date timestamp;

    public abstract boolean initiateTransaction();
}
