package com.pm;

public interface DocumentElement {
    void accept(DocumentVisitor  visitor);
}
