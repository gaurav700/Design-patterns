package com.pm;

import com.pm.impl.Heading;
import com.pm.impl.Image;
import com.pm.impl.Paragraph;
import com.pm.implVisitor.HtmlExportVisitor;
import com.pm.implVisitor.WordCountVisitor;

import java.util.List;

/**
 * TIP The Visitor Design Pattern is a behavioral pattern that lets you add new operations to existing object structures without modifying their classes.
 * Build a document model with Paragraph, Heading, and Image elements. Implement two visitors: a WordCountVisitor that counts total words across all text-based elements, and an HtmlExportVisitor that converts each element to its HTML representation.
 * Requirements:
 * Element interface DocumentElement with accept(visitor)
 * Paragraph has text (string)
 * Heading has text (string) and level (int, 1-6)
 * Image has url (string) and altText (string)
 * WordCountVisitor counts words in Paragraph and Heading text (Image contributes 0 words), exposes getWordCount()
 * HtmlExportVisitor outputs: <p>text</p>, <h{level}>text</h{level}>, <img src="url" alt="altText" />
 */
public class Main {
    public static void main(String[] args) {
        List<DocumentElement> doc = List.of(
                new Heading("My Document", 1),
                new Paragraph("This is the first paragraph with some text."),
                new Image("photo.jpg", "A photo"),
                new Paragraph("Another paragraph here.")
        );

        WordCountVisitor counter = new WordCountVisitor();
        for (DocumentElement el : doc) el.accept(counter);
        System.out.println("Word count: " + counter.getWordCount());

        HtmlExportVisitor exporter = new HtmlExportVisitor();
        for (DocumentElement el : doc) el.accept(exporter);
    }
}