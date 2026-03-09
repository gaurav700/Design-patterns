package com.pm;

public class Game {
    private int health = 100;
    private int level = 1;
    private int position = 0;

    public void play(){
        level++;
        position+=10;
        System.out.println("Playing... Level: " + level + ", Position: " + position + ", Health: " + health);
    }

    public void takeDamage(int amount){
        health-=amount;
        System.out.println("Took " + amount + " damage. Health: " + health);
    }

    public GameMemento save(){
        return new GameMemento(health,level,position);
    }

    public void restore(GameMemento memento){
        this.health=memento.getHealth();
        this.level=memento.getLevel();
        this.position=memento.getPosition();
        System.out.println("Game Loaded: Level: "+level+", Position: "+position+", Health: "+health);
    }
}
