package com.language.programming.model.enumerations;

public enum Condition {
    PROGRESS("Writing..."), REGRESS("Erasing..."), EMPTY("Not yet written.");

    private final String description;

    private Condition(String description) {
        this.description = description;
    }

    public boolean equalsName(String name) {
        return description.equals(name);
    }

    public String toString() {
        return this.description;
    }
}
