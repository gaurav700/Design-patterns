package com.pm;

import com.pm.strategy.impl.LowerCaseFormatter;
import com.pm.strategy.impl.TitleCaseFormatter;
import com.pm.strategy.impl.UppercaseFormatter;

/**
 * TIP The Strategy Design Pattern is a behavioral pattern that lets you define a family of algorithms, encapsulate each one in its own class, and make them interchangeable at runtime.
 * <br>Build a text formatting system where different strategies format text in different ways. The TextEditor context should allow swapping formatters at runtime, so the same editor can produce uppercase, lowercase, or title case output depending on the active strategy.
 * <br>Requirements: <br>
 * Strategy interface: TextFormatter with a method format(text) that returns a formatted string<br>
 * Concrete strategies: UpperCaseFormatter, LowerCaseFormatter, TitleCaseFormatter<br>
 * Context: TextEditor with setFormatter() to swap strategies and publishText() to format and print text<br>
 */
public class Main {
    public static void main(String[] args) {
         TextEditor editor = new TextEditor(new UppercaseFormatter());
         editor.publishText("hello world from strategy pattern");

         editor.setFormatter(new LowerCaseFormatter());
         editor.publishText("Hello World From Strategy Pattern");

         editor.setFormatter(new TitleCaseFormatter());
         editor.publishText("hello world from strategy pattern");
    }
}