package com.onyx.onyxapi.commons.model;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import static java.util.Objects.requireNonNull;

@EqualsAndHashCode
@ToString
public final class BasketballStatisticResponse{
    BasketballPlayerInfo basketballPlayerInfo;
    BasicBasketballStatistics basicPlayerStats;

    public BasketballStatisticResponse(BasketballPlayerInfo basketballPlayerInfo, BasicBasketballStatistics basicPlayerStats) {
        this.basketballPlayerInfo = requireNonNull(basketballPlayerInfo, "basketballPlayerInfo is required and missing");
        this.basicPlayerStats = requireNonNull(basicPlayerStats, "basicPLayerStats is required and missing");
    }
}