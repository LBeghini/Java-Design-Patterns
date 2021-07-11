package com.language.programming.model.states;

import com.language.programming.model.Star;
import com.language.programming.model.StarState;
import com.language.programming.model.enumerations.StarLifeCycle;

public class WhiteDwarf implements StarState {

    private static WhiteDwarf instance = new WhiteDwarf();

    public static WhiteDwarf getInstance() {
        return instance;
    }

    @Override
    public String getState() {
        return StarLifeCycle.WHITE_DWARF.toString();
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
        return null;
    }

    @Override
    public String whiteDwarf(Star star) {
        return null;
    }

}
