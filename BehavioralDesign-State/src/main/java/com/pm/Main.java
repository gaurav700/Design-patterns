package com.pm;

//TIP The State Design Pattern is a behavioral design pattern that lets an object change its behavior when its internal state changes, as if it were switching to a different class at runtime.
public class Main {
    public static void main(String[] args) {
        Document doc = new Document();

        doc.edit("First draft of the article.");
        doc.approve();              // Rejected: cannot approve a draft
        doc.submitForReview();
        doc.edit("Trying to edit");  // Rejected: under review
        doc.reject();                // Back to draft
        doc.edit("Revised draft.");
        doc.submitForReview();
        doc.approve();               // Published
        doc.edit("Trying to edit");  // Rejected: published
        doc.unpublish();
    }
}