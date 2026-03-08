package com.pm;

/**
 * TIP The Flyweight Design Pattern is a structural pattern that focuses on efficiently sharing common parts of object state across many objects to reduce memory usage and boost performance.
 * <br>Problem: Build a word processor where characters share FontStyle flyweight objects. Each FontStyle stores the font family, size, and whether it is bold or italic. The position (line, column) is extrinsic state that varies per character.
 * <br>Requirements:<br>
 * Flyweight interface: FontStyle with a method format(int line, int column, char character)<br>
 * Concrete flyweight: ConcreteFontStyle storing fontFamily (String), fontSize (int), bold (boolean), italic (boolean)<br>
 * Factory: FontStyleFactory with getFontStyle(fontFamily, fontSize, bold, italic) and getStyleCount()<br>
 * Client code creates multiple characters sharing styles, then prints them<br>
 */
public class Main {
    public static void main(String[] args) {
         FontStyleFactory factory = new FontStyleFactory();
         FontStyle arial12 = factory.getFontStyle("Arial", 12, false, false);
         FontStyle arial12Bold = factory.getFontStyle("Arial", 12, true, false);
         FontStyle arial12Again = factory.getFontStyle("Arial", 12, false, false);

         arial12.format(1, 1, 'H');
         arial12Bold.format(1, 2, 'e');
         arial12Again.format(1, 3, 'l');

         System.out.println("Same instance? " + (arial12 == arial12Again));
         System.out.println("Total styles: " + factory.getStyleCount());
    }
}