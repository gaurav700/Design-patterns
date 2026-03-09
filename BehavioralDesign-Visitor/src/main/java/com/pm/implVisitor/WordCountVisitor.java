package com.pm.implVisitor;

import com.pm.DocumentVisitor;
import com.pm.impl.Heading;
import com.pm.impl.Image;
import com.pm.impl.Paragraph;

public class WordCountVisitor implements DocumentVisitor {
    private int wordCount =0;
    @Override
    public void visitParagraph(Paragraph paragrah) {
        wordCount += paragrah.getText().split(" ").length;
    }

    public int getWordCount(){
        return wordCount;
    }
    @Override
    public void visitHeading(Heading heading) {
        wordCount = heading.getText().split(" ").length;
    }

    @Override
    public void visitImage(Image image) {
        wordCount = 0;
    }
}
