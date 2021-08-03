package com.language.programming.src;

public abstract class Package {

    private String description;

    public Package(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract String getContent();

}
