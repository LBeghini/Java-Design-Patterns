package com.language.programming.model.factory;

import com.language.programming.model.Blacksmith;
import com.language.programming.model.Weapon;
import com.language.programming.model.enumerations.WeaponType;

public class OrcBlacksmith implements Blacksmith {

    public Weapon forge(WeaponType weaponType) {
        return new Weapon(weaponType, 100f, 40f, 30f, 15f);
    }

}