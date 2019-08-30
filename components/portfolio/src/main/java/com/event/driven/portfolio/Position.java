package com.event.driven.portfolio;

public class Position {

    private String ticker;
    private Long marketValue;
    private Long cost;

    public Position(String ticker, Long marketValue, Long cost) {
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
}
