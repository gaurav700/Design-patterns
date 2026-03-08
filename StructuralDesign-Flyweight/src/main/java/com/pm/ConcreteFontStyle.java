package com.pm;

public class ConcreteFontStyle implements FontStyle {

    String fontFamily;
    int fontSize;
    boolean bold;
    boolean italic;

    public ConcreteFontStyle(String fontFamily, int fontSize, boolean bold, boolean italic) {
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
        this.bold = bold;
        this.italic = italic;
    }

    @Override
    public void format(int line, int column, char character) {
        String style = bold ? "bold" : (italic ? "italic" : "normal");
        System.out.println("[" + fontFamily + ", " + fontSize + ", " + style + "] '" + character + "' at " + line + ":" + column);
    }

}
