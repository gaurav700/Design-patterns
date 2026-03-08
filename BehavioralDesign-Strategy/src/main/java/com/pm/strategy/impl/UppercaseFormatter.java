package com.pm.strategy.impl;

import com.pm.strategy.TextFormatter;

public class UppercaseFormatter implements TextFormatter {
    @Override
    public String format(String text) {
        return text.toUpperCase();
    }
}
