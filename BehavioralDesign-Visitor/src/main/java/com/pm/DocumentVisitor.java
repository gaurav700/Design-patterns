package com.pm;


import com.pm.impl.Heading;
import com.pm.impl.Image;
import com.pm.impl.Paragraph;

public interface DocumentVisitor {
    void visitParagraph(Paragraph paragrah);
    void visitHeading(Heading heading);
    void visitImage(Image image);
}
