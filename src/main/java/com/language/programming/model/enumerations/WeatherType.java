package com.language.programming.model.enumerations;

public enum WeatherType {
    SUNNY("☀️"), CLOUDY("☁️"), RAINY("🌧️");

    private final String name;

    private WeatherType(String emoji) {
        name = emoji;
    }

    public boolean equalsName(String otherName) {
        return name.equals(otherName);
    }

    public String toString() {
        return this.name;
    }

}
