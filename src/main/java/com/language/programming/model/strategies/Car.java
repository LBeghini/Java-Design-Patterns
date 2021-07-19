package com.language.programming.model.strategies;

import com.language.programming.model.Strategy;

public class Car implements Strategy {

    @Override
    public String calculate() {
        return "Shortest driving path";
    }

}
