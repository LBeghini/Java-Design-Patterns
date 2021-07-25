package com.language.programming.model;

public abstract class Candy {

    protected Flavor flavor;
    protected float sugar;

    public Candy() {
        this.sugar = 50f;
    }

    public void setFlavor(Flavor flavor) {
        this.flavor = flavor;
    }

    public abstract float getSugar();

}
