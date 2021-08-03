package com.language.programming.src;

public class Item extends Package {

    public Item(String description) {
        super(description);
    }

    @Override
    public String getContent() {
        return this.getDescription();
    }

}
