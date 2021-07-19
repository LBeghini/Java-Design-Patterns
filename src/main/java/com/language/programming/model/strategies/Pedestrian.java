package com.language.programming.model.strategies;

import com.language.programming.model.Strategy;

public class Pedestrian implements Strategy {

    @Override
    public String calculate() {
        return "Shortest walking path";
    }

}
