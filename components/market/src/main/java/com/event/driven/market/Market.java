package com.event.driven.market;

public class Market {

    TradeSubmittedEvent approveTrade(RequestTradeApprovalEvent trade) {
        double randomNumber = Math.random();

        if(randomNumber % 3 == 0) {
            return new TradeSubmittedEvent(trade.getId(), "REJECTED");
        } else {
            return new TradeSubmittedEvent(trade.getId(), "APPROVED");
        }
    }

}
