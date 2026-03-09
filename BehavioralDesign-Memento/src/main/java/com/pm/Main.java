package com.pm;

//TIP The Memento Design Pattern is a behavioral design pattern that lets you capture and store an object’s internal state so it can be restored later, without violating encapsulation.
public class Main {
    public static void main(String[] args) {
         Game game = new Game();
         SaveManager saveManager = new SaveManager();

         game.play();                // Level 2, Position 10
         game.play();                // Level 3, Position 20
         saveManager.save(game, 0);  // Save to slot 0

         game.takeDamage(50);        // Health: 50
         game.play();                // Level 4, Position 30
         saveManager.save(game, 1);  // Save to slot 1

         game.takeDamage(40);        // Health: 10
         System.out.println("\n--- Load Slot 0 ---");
         saveManager.load(game, 0);  // Back to: Health 100, Level 3, Position 20

         System.out.println("\n--- Load Slot 1 ---");
         saveManager.load(game, 1);  // Back to: Health 50, Level 4, Position 30
    }
}