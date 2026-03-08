package com.pm;

import java.util.HashMap;
import java.util.Map;

public class FontStyleFactory {

    private final Map<String, FontStyle> fontStyles = new HashMap<>();

    public FontStyle getFontStyle(String fontFamily, int fontSize, boolean bold, boolean italic){
        String key =  fontFamily + "_" + fontSize + "_" + bold + "_" + italic;
        FontStyle style = fontStyles.get(key);
        if(style == null){
            FontStyle concreteFontStyle = new ConcreteFontStyle(fontFamily, fontSize, bold, italic);
            fontStyles.put(key, concreteFontStyle);
            return concreteFontStyle;
        }
        return style;
    }

    public int getStyleCount(){
        return fontStyles.size();
    }
}
