package com.language.programming.model;

public class Character {

    private String name;
    private Color hairColor;
    private Color skinColor;
    private Color eyeColor;

    public Character(String name, String hairColor, String skinColor, String eyeColor) {
        this.name = name;
        this.hairColor = ColorFlyweight.getColor(hairColor);
        this.skinColor = ColorFlyweight.getColor(skinColor);
        this.eyeColor = ColorFlyweight.getColor(eyeColor);
    }

    public String toString() {
        return "Character: \n" + "  name: " + this.name + "\n  hair color: " + this.hairColor + "\n  skin color: "
                + this.skinColor + "\n  eye color: " + this.eyeColor;
    }

}
