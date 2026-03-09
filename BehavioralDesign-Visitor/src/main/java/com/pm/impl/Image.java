package com.pm.impl;

import com.pm.DocumentElement;
import com.pm.DocumentVisitor;

public class Image implements DocumentElement {
    private String url;
    private String altText;

    public Image(String url, String altText) {
        this.url = url;
        this.altText = altText;
    }

    public String getUrl() {
        return url;
    }

    public String getAltText() {
        return altText;
    }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visitImage(this);
    }
}
