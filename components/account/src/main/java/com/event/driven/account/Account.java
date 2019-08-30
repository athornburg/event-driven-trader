package com.event.driven.account;

public class Account {
    private String id;
    private Long funds = 1000000000L;

    public Account(String id) {
        this.id = id;
    }

    public Funds acquireFunds(AcquireFundsEvent acquireFundsEvent) {
        funds = funds - acquireFundsEvent.getAmountRequested();
        return new Funds(acquireFundsEvent.getAmountRequested());
    }
}
