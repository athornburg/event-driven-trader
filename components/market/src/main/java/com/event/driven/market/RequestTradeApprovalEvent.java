package com.event.driven.market;

public class RequestTradeApprovalEvent {
    private String ticker;
    private Long price;

    public RequestTradeApprovalEvent(String ticker, Long price) {
        this.ticker = ticker;
        this.price = price;
    }

    public String getTicker() {
        return ticker;
    }

    public Long getPrice() {
        return price;
    }
}
