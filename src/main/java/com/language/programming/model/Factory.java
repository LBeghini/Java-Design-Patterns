package com.language.programming.model;

import com.language.programming.model.enumerations.WeaponType;

public class Factory {

    public Blacksmith getDwarfBlacksmith() {
        return new DwarfBlacksmith();
    }

    public Blacksmith getElfBlacksmith() {
        return new ElfBlacksmith();
    }

    public Blacksmith getHumanBlacksmith() {
        return new HumanBlacksmith();
    }

    public Blacksmith getOrcBlacksmith() {
        return new OrcBlacksmith();
    }

}

class DwarfBlacksmith implements Blacksmith {

    public Weapon forge(WeaponType weaponType) {
        return new Weapon(weaponType, 100f, 20f, 15f, 10f);
    }

}

class ElfBlacksmith implements Blacksmith {

    public Weapon forge(WeaponType weaponType) {
        return new Weapon(weaponType, 100f, 30f, 10f, 6f);
    }

}

class HumanBlacksmith implements Blacksmith {

    public Weapon forge(WeaponType weaponType) {
        return new Weapon(weaponType, 100f, 20f, 10f, 10f);
    }

}

class OrcBlacksmith implements Blacksmith {

    public Weapon forge(WeaponType weaponType) {
        return new Weapon(weaponType, 100f, 40f, 30f, 15f);
    }

}
