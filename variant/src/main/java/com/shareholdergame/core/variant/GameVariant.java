package com.shareholdergame.core.variant;

import org.apache.commons.lang3.builder.Builder;

import java.util.Map;
import java.util.Set;

/**
 * Created by alex on 29.1.18.
 */
public class GameVariant {

    private String name;

    private PriceScale priceScale;

    private Map<String, Set<Card>> cardSet;

    private Map<Long, Card> cardMap;

    public GameVariant(GameVariantBuilder gameVariantBuilder) {

    }

    public String getName() {
        return name;
    }

    public PriceScale getPriceScale() {
        return priceScale;
    }

    static class GameVariantBuilder implements Builder<GameVariant> {

        @Override
        public GameVariant build() {
            return new GameVariant(this);
        }
    }
}
