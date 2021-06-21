package com.language.programming.model.factory;

import com.language.programming.model.Blacksmith;
import com.language.programming.model.Weapon;
import com.language.programming.model.enumerations.WeaponType;

public class DwarfBlacksmith implements Blacksmith {

    public Weapon forge(WeaponType weaponType) {
        return new Weapon(weaponType, 100f, 20f, 15f, 10f);
    }

}