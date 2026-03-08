package com.pm.impl;

import com.pm.EditorCommand;
import com.pm.TextEditor;

public class TypeCommand implements EditorCommand {
    private final TextEditor textEditor;
    private final String text;

    public TypeCommand(TextEditor textEditor, String text) {
        this.textEditor = textEditor;
        this.text = text;
    }

    @Override
    public void execute() {
        textEditor.append(text);
        System.out.println("Typed: \"" + text + "\"");
    }

    @Override
    public void undo() {
        textEditor.deleteLast(text.length());
        System.out.println("Undo type: \"" + text + "\"");
    }
}
