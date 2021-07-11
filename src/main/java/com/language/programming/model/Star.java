package com.language.programming.model;

import java.util.ArrayList;
import java.util.List;

import com.language.programming.model.states.AverageStar;

public class Star {

    private String name;
    private double ageBillionYears;
    private StarState state;
    private List<StarState> memento = new ArrayList<>();

    public Star(String name, double ageBillionYears) {
        this.name = name;
        this.ageBillionYears = ageBillionYears;
        this.state = AverageStar.getInstance();
        this.memento.add(this.state);
    }

    public StarState getState() {
        return this.state;
    }

    public void setState(StarState state) {
        this.state = state;
        this.memento.add(this.state);
    }

    public List<StarState> getMemento() {
        return this.memento;
    }

    public void restoreState(int index) {
        if (this.memento.isEmpty()) {
            return;
        }

        if (index < 0 || index > this.memento.size() - 1) {
            throw new IllegalArgumentException("Invalid index");
        }

        this.state = this.memento.get(index);

    }

    public void undo() {
        if (this.memento.isEmpty()) {
            return;
        }

        int current = this.memento.indexOf(this.state);

        if (current == 0) {
            return;
        }

        this.state = this.memento.get(current - 1);

    }

    public String averageStar() {
        return state.averageStar(this);
    }

    public String redGiant() {
        return state.redGiant(this);
    }

    public String planetaryNebula() {
        return state.planetaryNebula(this);
    }

    public String whiteDwarf() {
        return state.whiteDwarf(this);
    }

}
