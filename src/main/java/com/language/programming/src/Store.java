package com.language.programming.src;

public class Store {

    private Chair chair;
    private Couch couch;

    public Store (AbstractFactory abstractFactory) {
        this.chair = abstractFactory.buildChair();
        this.couch = abstractFactory.buildCouch();
    }

    public String getChair() {
        return this.chair.build();
    }

    public String getCouch() {
        return this.couch.build();
    }
    
}
