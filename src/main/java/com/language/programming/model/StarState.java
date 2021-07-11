package com.language.programming.model;

public interface StarState {

    String getState();

    String averageStar(Star star);

    String redGiant(Star star);

    String planetaryNebula(Star star);

    String whiteDwarf(Star star);
}
