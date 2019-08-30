package com.event.driven.portfolio;

import java.util.List;
import java.util.UUID;

import static java.util.Collections.emptyList;

public class Portfolio {
    private List<Position> positions = emptyList();
    private String id;


    public Portfolio(String id) {
        this.id = id;
    }

    public PositionsUpdatedEvent positionReceived(PositionReceivedEvent positionReceivedEvent) {
        positions.add(new Position(UUID.randomUUID().toString(), positionReceivedEvent.getTicker(), 0L,  positionReceivedEvent.getCost()));
        return new PositionsUpdatedEvent(positions);
    }

}
