package com.pm;

import com.pm.impl.DeleteCommand;
import com.pm.impl.TypeCommand;

//TIP The Command Design Pattern is a behavioral pattern that turns a request into a standalone object, allowing you to parameterize actions, queue them, log them, or support undoable operations all while decoupling the sender from the receiver.
public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        EditorInvoker invoker = new EditorInvoker();

        invoker.execute(new TypeCommand(editor, "Hello"));
        invoker.execute(new TypeCommand(editor, " World"));
        invoker.execute(new TypeCommand(editor, "!"));
        System.out.println("Content: \"" + editor.getContent() + "\"");

        System.out.println("\n--- Undo ---");
        invoker.undo();
        System.out.println("Content: \"" + editor.getContent() + "\"");

        invoker.undo();
        System.out.println("Content: \"" + editor.getContent() + "\"");

        System.out.println("\n--- Redo ---");
        invoker.redo();
        System.out.println("Content: \"" + editor.getContent() + "\"");

        System.out.println("\n--- New operation clears redo ---");
        invoker.execute(new DeleteCommand(editor, 3));
        System.out.println("Content: \"" + editor.getContent() + "\"");

        invoker.redo();

        System.out.println("\n--- Undo delete ---");
        invoker.undo();
        System.out.println("Content: \"" + editor.getContent() + "\"");
    }
}