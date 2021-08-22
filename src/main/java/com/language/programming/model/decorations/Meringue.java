package com.language.programming.model.decorations;

import com.language.programming.model.CakePan;
import com.language.programming.model.CakeDecorator;

public class Meringue extends CakeDecorator {

    public Meringue(CakePan cake) {
        super(cake);
    }

    @Override
    public String getAdornment() {
        return "Meringue";
    }

}
