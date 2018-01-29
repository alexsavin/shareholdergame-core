package com.shareholdergame.core.variant;

import java.util.HashMap;
import java.util.Map;

/**
 * Date: 01/30/2018
 *
 * @author Aliaksandr Savin
 */
public class GameFormula {

    /**
     * Creates {@link GameFormula} instance.
     *
     * @param firstCardGroupId
     * @param firstGroupQuantity
     * @param secondCardGroupId
     * @param secondGroupQuantity
     * @return
     */
    public static GameFormula of(String firstCardGroupId, int firstGroupQuantity,
                                  String secondCardGroupId, int secondGroupQuantity) {
        GameFormula formula = new GameFormula();
        formula.formulaMap.put(firstCardGroupId, firstGroupQuantity);
        formula.formulaMap.put(secondCardGroupId, secondGroupQuantity);
        return formula;
    }

    private Map<String, Integer> formulaMap = new HashMap<>(2);

    /**
     * Returns number of cards for specified group.
     *
     * @param cardGroupId
     * @return
     */
    public int cardQuantity(String cardGroupId) {
        return formulaMap.getOrDefault(cardGroupId, 0);
    }
}
