package com.event.driven.account;

public class AcquireFundsEvent {
    private String accountId;
    private Long amountRequested;

    public AcquireFundsEvent(String accountId, Long amountRequested) {
        this.accountId = accountId;
        this.amountRequested = amountRequested;
    }

    public String getAccountId() {
        return accountId;
    }

    public Long getAmountRequested() {
        return amountRequested;
    }
}
