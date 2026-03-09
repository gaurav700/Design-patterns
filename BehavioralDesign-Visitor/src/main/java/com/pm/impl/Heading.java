package com.pm.impl;

import com.pm.DocumentElement;
import com.pm.DocumentVisitor;

public class Heading implements DocumentElement {
    private String text;
    private int level;
    public Heading(String text, int level) {
        this.text = text;
        this.level = level;
    }

    public String getText() {
        return text;
    }
    public int getLevel() {
        return level;
    }


    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visitHeading(this);
    }
}
