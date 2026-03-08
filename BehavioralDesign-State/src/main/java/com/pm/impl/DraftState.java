package com.pm.impl;

import com.pm.Document;
import com.pm.DocumentState;

public class DraftState implements DocumentState {
    @Override
    public void edit(Document context, String content) {
        System.out.println("Editing Document...");
        delay(2000);
        context.setContent(content);
    }

    @Override
    public void submitForReview(Document context) {
        System.out.println("Document Submitted for Review.");
    }

    @Override
    public void approve(Document context) {
        System.out.println("Cannot approve a draft. Submit for review first.");
    }

    @Override
    public void reject(Document context) {
        System.out.println("Cannot reject a draft. Submit for review first.");
    }

    @Override
    public void unpublish(Document context) {
        System.out.println("Document is already a draft.");
    }

    public void delay(int ms){
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
