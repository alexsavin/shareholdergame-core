package com.shareholdergame.core.variant;

/**
 * Date: 01/31/2018
 *
 * @author Aliaksandr Savin
 */
public class PriceScale {

    private int stepSize;

    private int minPrice;

    private int maxPrice;

    public PriceScale(int stepSize, int minPrice, int maxPrice) {
        this.stepSize = stepSize;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }

    public int getStepSize() {
        return stepSize;
    }

    public int getMinPrice() {
        return minPrice;
    }

    public int getMaxPrice() {
        return maxPrice;
    }
}
