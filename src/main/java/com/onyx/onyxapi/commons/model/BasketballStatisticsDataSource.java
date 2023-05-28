package com.onyx.onyxapi.commons.model;

import java.util.Locale;

import static com.onyx.onyxapi.commons.util.Preconditions.requireNotBlank;

public enum BasketballStatisticsDataSource {
    BASKETBALL_REFERENCE;

    public static BasketballStatisticsDataSource fmtInsensitiveValueOf(String basketballLeagueDataSource) {
        requireNotBlank(basketballLeagueDataSource,"basketballLeagueDataSource is required and missing");

        return valueOf(basketballLeagueDataSource.strip().toUpperCase(Locale.ROOT));
    }
}