package com.pm.strategy.impl;

import com.pm.strategy.TextFormatter;

public class LowerCaseFormatter implements TextFormatter {
    @Override
    public String format(String text) {
        return text.toLowerCase();
    }
}
