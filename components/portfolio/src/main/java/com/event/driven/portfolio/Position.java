package com.event.driven.portfolio;

public class Position {

    private String id;
    private String ticker;
    private Long marketValue;
    private Long cost;

    public Position(String id, String ticker, Long marketValue, Long cost) {
        this.id = id;
        this.ticker = ticker;
        this.marketValue = marketValue;
        this.cost = cost;
    }

    public String getTicker() {
        return ticker;
    }

    public Long getMarketValue() {
        return marketValue;
    }

    public Long getCost() {
        return cost;
    }

    public String getId() {
        return id;
    }
}
