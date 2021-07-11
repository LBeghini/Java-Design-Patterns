package com.language.programming.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.language.programming.model.states.AverageStar;
import com.language.programming.model.states.PlanetaryNebula;
import com.language.programming.model.states.RedGiant;
import com.language.programming.model.states.WhiteDwarf;

import org.junit.jupiter.api.BeforeEach;

public class StarTest {

    private Star star;

    @BeforeEach
    private void setUp() {
        this.star = new Star("Sun", 4.603);
    }

    @Test
    public void shouldKeepState() {
        star.setState(RedGiant.getInstance());
        star.setState(PlanetaryNebula.getInstance());
        assertEquals(3, star.getMemento().size());
    }

    @Test
    public void shouldRestoreInitialState() {
        star.setState(RedGiant.getInstance());
        star.setState(PlanetaryNebula.getInstance());
        star.setState(WhiteDwarf.getInstance());
        star.restoreState(0);
        assertEquals(AverageStar.getInstance(), star.getState());
    }

    @Test
    public void shouldUndoState() {
        star.setState(RedGiant.getInstance());
        star.setState(PlanetaryNebula.getInstance());
        star.setState(WhiteDwarf.getInstance());
        star.undo();
        star.undo();
        star.undo();
        assertEquals(AverageStar.getInstance(), star.getState());
    }

    @Test
    public void shouldNotFailUndoStateWithoutChanges() {
        star.undo();
        assertEquals(AverageStar.getInstance(), star.getState());
    }

    @Test
    public void shouldFailRestoreStateWrongIndex() {
        assertThrows(IllegalArgumentException.class, () -> {
            star.restoreState(3);

        });
    }

}
