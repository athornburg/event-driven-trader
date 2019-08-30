package com.event.driven.account;

import java.util.Collections;
import java.util.Map;

public class Account {
    private Map<String, Long> accountBalances = Collections.singletonMap("Alex's account", 1000000000L);

    long getBalance(String accountId) {
        return accountBalances.get(accountId);
    }

    void acquireFunds(AcquireFundsEvent acquireFundsEvent) {
        Long funds = accountBalances.get(acquireFundsEvent.getAccountId());
        Long newBalance = funds - acquireFundsEvent.getAmountRequested();
        accountBalances.put(acquireFundsEvent.getAccountId(), newBalance);

        // send funds acquired event
    }
}
