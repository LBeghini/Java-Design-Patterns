package com.language.programming.model.enumerations;

public enum StarLifeCycle {
    AVERAGE("Average Star"), RED_GIANT("Red Giant"), PLANETARY_NEBULA("Planetary Nebula"), WHITE_DWARF("White Dwarf");

    private String name;

    StarLifeCycle(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }
}
