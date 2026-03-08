package com.pm.impl;

import com.pm.Document;
import com.pm.DocumentState;

public class PublishedState implements DocumentState {
    @Override
    public void edit(Document context, String content) {
        System.out.println("Cannot edit a published document. Unpublish first.");
    }

    @Override
    public void submitForReview(Document context) {
        System.out.println("Document is already published.");
    }

    @Override
    public void approve(Document context) {
        System.out.println("Document is already published.");
    }

    @Override
    public void reject(Document context) {
        System.out.println("Document is already published.");
    }

    @Override
    public void unpublish(Document context) {
        delay(2000);
        System.out.println("Document unpublished. Returning to draft.");
        context.setState(new DraftState());
    }

    public void delay(int ms)
    {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
