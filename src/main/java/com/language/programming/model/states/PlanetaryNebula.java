package com.language.programming.model.states;

import com.language.programming.model.Star;
import com.language.programming.model.StarState;
import com.language.programming.model.enumerations.StarLifeCycle;

public class PlanetaryNebula implements StarState {

    private static PlanetaryNebula instance = new PlanetaryNebula();

    public static PlanetaryNebula getInstance() {
        return instance;
    }

    @Override
    public String getState() {
        return StarLifeCycle.PLANETARY_NEBULA.toString();
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
        star.setState(WhiteDwarf.getInstance());
        return StarLifeCycle.WHITE_DWARF.toString();
    }

}
