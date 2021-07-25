package com.language.programming.model.candies;

import com.language.programming.model.Candy;

public class Cake extends Candy {

    public Cake() {
        super();
    }

    @Override
    public float getSugar() {
        return this.sugar - this.flavor.sugar();
    }

}
