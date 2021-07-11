package com.language.programming.model.states;

import com.language.programming.model.Star;
import com.language.programming.model.StarState;
import com.language.programming.model.enumerations.StarLifeCycle;

public class AverageStar implements StarState {

    private static AverageStar instance = new AverageStar();

    public static AverageStar getInstance() {
        return instance;
    }

    @Override
    public String getState() {
        return StarLifeCycle.AVERAGE.toString();
    }

    @Override
    public String averageStar(Star star) {
        return null;
    }

    @Override
    public String redGiant(Star star) {
        star.setState(RedGiant.getInstance());
        return StarLifeCycle.RED_GIANT.toString();
    }

    @Override
    public String planetaryNebula(Star star) {
        return null;
    }

    @Override
    public String whiteDwarf(Star star) {
        return null;
    }
}
