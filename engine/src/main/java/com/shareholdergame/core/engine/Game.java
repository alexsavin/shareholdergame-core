package com.shareholdergame.core.engine;

import com.shareholdergame.core.variant.GameFormula;
import com.shareholdergame.core.variant.GameVariant;
import org.apache.commons.lang3.builder.Builder;

/**
 * This class represents a game.
 * Steps
 * 1 Initialization
 * 2 Moves
 * 3 Results calculation
 *
 *
 * Created by alex on 29.1.18.
 */
public class Game {

    public static Game initialize(GameVariant gameVariant, GameFormula gameFormula, int playerCount) {
        GameBuilder builder = new GameBuilder();
        Game game = builder.build();

        return game;
    }

    private Game(GameBuilder builder) {

    }

    static class GameBuilder implements Builder<Game> {

        

        public Game build() {
            return new Game(this);
        }
    }
}
