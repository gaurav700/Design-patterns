package com.pm;

public class GameMemento {
    private final int health;
    private final int level;
    private final int position;

    public GameMemento(int health, int level, int position) {
        this.health = health;
        this.level = level;
        this.position = position;
    }

    public int getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }

    public int getPosition() {
        return position;
    }
}
