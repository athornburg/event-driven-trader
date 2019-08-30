package com.event.driven.market;

public class TradeSubmittedEvent {
    private String id;
    String status;

    public TradeSubmittedEvent(String id, String status) {
        this.id = id;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public String getId() {
        return id;
    }
}
