package com.language.programming.model.enumerations;

public enum DeviceType {
    SMARTPHONE("📱"), COMPUTER("🖥️"), NOTEBOOK("💻");

    private final String name;

    private DeviceType(String emoji) {
        name = emoji;
    }

    public boolean equalsName(String otherName) {
        return name.equals(otherName);
    }

    public String toString() {
        return this.name;
    }

}
