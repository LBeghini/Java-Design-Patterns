package com.language.programming.model;

import com.language.programming.model.enumerations.*;

public class Trooper implements Cloneable {
    private String name;
    private Specie specie;
    private Gender gender;
    private Float height;
    private Color hairColor;
    private Color eyeColor;

    public Trooper(String name, Specie specie, Gender gender, Float height, Color hairColor, Color eyeColor) {
        this.name = name;
        this.specie = specie;
        this.gender = gender;
        this.height = height;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Specie getSpecie() {
        return specie;
    }

    public void setSpecie(Specie specie) {
        this.specie = specie;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Color getHairColor() {
        return hairColor;
    }

    public void setHairColor(Color hairColor) {
        this.hairColor = hairColor;
    }

    public Color getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(Color eyeColor) {
        this.eyeColor = eyeColor;
    }

    @Override
    public Trooper clone() {
        try {
            return (Trooper) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new InternalError();
        }
    }
}
