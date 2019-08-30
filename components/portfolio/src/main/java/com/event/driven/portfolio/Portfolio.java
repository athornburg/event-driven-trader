package com.event.driven.portfolio;

import java.util.List;

import static java.util.Collections.emptyList;

public class Portfolio {

    List<Position> getPositions() {
        return emptyList();
    }

    void positionReceived(Position position) {

    }

    void positionSold(Position position) {

    }
}
