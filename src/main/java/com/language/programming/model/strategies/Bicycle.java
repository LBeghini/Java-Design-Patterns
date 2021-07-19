package com.language.programming.model.strategies;

import com.language.programming.model.Strategy;

public class Bicycle implements Strategy {
    @Override
    public String calculate() {
        return "Shortest cycling path";
    }

}
