package com.pm;

import java.util.HashMap;
import java.util.Map;

public class SaveManager {
    private final Map<Integer, GameMemento> slots = new HashMap<>();

    public void save(Game game, int slot){
        slots.put(slot, game.save());
    }

    public void load(Game game, int slot){
            if(!slots.containsKey(slot)){
                System.out.println("No save in slot "+slot+ ".");
                return;
            }
            game.restore(slots.get(slot));
    }
}
