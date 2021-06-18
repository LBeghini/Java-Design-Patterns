package com.language.programming.model;

import com.language.programming.model.enumerations.WeaponType;

public interface Blacksmith {
    Weapon forge(WeaponType weaponType);
}