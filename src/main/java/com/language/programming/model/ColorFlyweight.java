package com.language.programming.model;

import java.util.HashMap;
import java.util.Map;

public class ColorFlyweight {

    private static Map<String, Color> colors = new HashMap<>();

    public static Color getColor(String name) {
        Color color = colors.get(name);
        if (color == null) {
            color = new Color(name);
            colors.put(name, color);
        }
        return color;
    }

    public static int getTotalColors() {
        return colors.size();
    }
}
