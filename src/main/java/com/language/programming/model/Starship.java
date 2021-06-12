package com.language.programming.model;

public class Starship {

    private Starship() {
    };

    private String name;
    private Float lenght;
    private Float diameter;
    private Float height;
    private Integer crewNumber;
    private Float fuel;

    private static Starship instance = new Starship();

    public static Starship getInstance() {
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getLenght() {
        return lenght;
    }

    public void setLenght(Float lenght) {
        this.lenght = lenght;
    }

    public Float getDiameter() {
        return diameter;
    }

    public void setDiameter(Float diameter) {
        this.diameter = diameter;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Integer getCrewNumber() {
        return crewNumber;
    }

    public void setCrewNumber(Integer crew) {
        this.crewNumber = crew;
    }

    public Float getFuel() {
        return fuel;
    }

    public void setFuel(Float fuel) {
        this.fuel = fuel;
    }
}
