package com.event.driven.market;

public class RequestTradeApprovalEvent {
    private String id;
    private String ticker;
    private Long price;

    public RequestTradeApprovalEvent(String id, String ticker, Long price) {
        this.id = id;
        this.ticker = ticker;
        this.price = price;
    }

    public String getTicker() {
        return ticker;
    }

    public Long getPrice() {
        return price;
    }

    public String getId() {
        return id;
    }
}
