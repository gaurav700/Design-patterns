package com.pm.strategy.impl;

import com.pm.strategy.TextFormatter;

public class TitleCaseFormatter implements TextFormatter {
    @Override
    public String format(String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }

        StringBuilder converted = new StringBuilder();
        boolean capitalizeNext = true;

        for (char ch : text.toCharArray()) {
            if (Character.isWhitespace(ch)) {
                converted.append(ch);
                capitalizeNext = true;
            } else if (capitalizeNext) {
                // Use Character.toTitleCase for the first letter
                converted.append(Character.toTitleCase(ch));
                capitalizeNext = false;
            } else {
                // Convert the rest of the letters in the word to lowercase
                converted.append(Character.toLowerCase(ch));
            }
        }
        return converted.toString();
    }
}
