package com.event.driven.market;

public class Market {

    void approveTrade(RequestTradeApprovalEvent trade) {
        double randomNumber = Math.random();

        if(randomNumber % 2 == 0) {
            // send trade approved event
        } else {
            // send trade rejected event
        }
    }

}
