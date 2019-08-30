package com.event.driven.portfolio;

import java.util.List;

public class PositionsUpdatedEvent {
    List<Position> positions;

    public PositionsUpdatedEvent(List<Position> positions) {
        this.positions = positions;
    }

    public List<Position> getPositions() {
        return positions;
    }
}
