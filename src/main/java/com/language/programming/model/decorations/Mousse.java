package com.language.programming.model.decorations;

import com.language.programming.model.CakePan;
import com.language.programming.model.CakeDecorator;

public class Mousse extends CakeDecorator {

    public Mousse(CakePan cake) {
        super(cake);
    }

    @Override
    public String getAdornment() {
        return "Mousse";
    }
}