package com.language.programming.model;

import com.language.programming.model.enumerations.WeaponType;

public class Weapon {
    private WeaponType weaponType;
    private Float durability;
    private Float height;
    private Float lenght;
    private Float weight;

    public Weapon(WeaponType weaponType, Float durability, Float height, Float lenght, Float weight) {
        this.weaponType = weaponType;
        this.durability = durability;
        this.setHeight(height);
        this.setLenght(lenght);
        this.setWeight(weight);
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public Float getDurability() {
        return durability;
    }

    public void setDurability(Float durability) {
        this.durability = durability;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Float getLenght() {
        return lenght;
    }

    public void setLenght(Float lenght) {
        this.lenght = lenght;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

}
