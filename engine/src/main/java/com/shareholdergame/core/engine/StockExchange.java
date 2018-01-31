package com.shareholdergame.core.engine;

import com.shareholdergame.core.variant.PriceScale;
import org.apache.commons.lang3.builder.Builder;

import java.util.Map;
import java.util.TreeMap;

/**
 * Class represents stock exchange.
 * It is responsible for read/update share prices.
 *
 * Created by alex on 29.1.18.
 */
public class StockExchange {

    private int minPrice;

    private int maxPrice;

    private int priceStep;

    private Map<Long, SharePrice> sharePriceMap = new TreeMap<>();

    public StockExchange(StockExchangeBuilder stockExchangeBuilder) {
        this.minPrice = stockExchangeBuilder.priceScale.getMinPrice();
        this.maxPrice = stockExchangeBuilder.priceScale.getMaxPrice();
        this.priceStep = stockExchangeBuilder.priceScale.getStepSize();
    }

    public void updatePrice() {

    }

    public void getPrice(Long shareId) {
        
    }

    static class StockExchangeBuilder implements Builder<StockExchange> {
        private PriceScale priceScale;

        public StockExchangeBuilder withPriceScale(PriceScale priceScale) {
            this.priceScale = priceScale;
            return this;
        }

        @Override
        public StockExchange build() {
            return new StockExchange(this);
        }
    }

    private class SharePrice {
        int prevPrice;
        int price;
    }
}
