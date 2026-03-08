package com.pm.impl;

import com.pm.EditorCommand;
import com.pm.TextEditor;

public class DeleteCommand implements EditorCommand {
    private final TextEditor textEditor;
    private final int count;
    private String deletedText;

    public DeleteCommand(TextEditor textEditor, int count) {
        this.textEditor = textEditor;
        this.count = count;
    }

    @Override
    public void execute() {
        deletedText = textEditor.deleteLast(count);
        System.out.println("Deleted: \"" + deletedText + "\"");
    }

    @Override
    public void undo() {
        textEditor.append(deletedText);
        System.out.println("Undo delete: restored \"" + deletedText + "\"");
    }
}
