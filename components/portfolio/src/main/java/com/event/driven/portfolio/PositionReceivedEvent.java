package com.event.driven.portfolio;

public class PositionReceivedEvent {
    private String portfolioId;
    String ticker;
    Long cost;

    public PositionReceivedEvent(String portfolioId, String ticker, Long cost) {
        this.portfolioId = portfolioId;
        this.ticker = ticker;
        this.cost = cost;
    }

    public String getTicker() {
        return ticker;
    }

    public Long getCost() {
        return cost;
    }

    public String getPortfolioId() {
        return portfolioId;
    }
}
