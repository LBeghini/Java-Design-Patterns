package com.language.programming.model.states;

import com.language.programming.model.Star;
import com.language.programming.model.StarState;
import com.language.programming.model.enumerations.StarLifeCycle;

public class RedGiant implements StarState {

    private static RedGiant instance = new RedGiant();

    public static RedGiant getInstance() {
        return instance;
    }

    @Override
    public String getState() {
        return StarLifeCycle.RED_GIANT.toString();
    }

    @Override
    public String averageStar(Star star) {
        return null;
    }

    @Override
    public String redGiant(Star star) {
        return null;
    }

    @Override
    public String planetaryNebula(Star star) {
        star.setState(PlanetaryNebula.getInstance());
        return StarLifeCycle.PLANETARY_NEBULA.toString();
    }

    @Override
    public String whiteDwarf(Star star) {
        return null;
    }

}
