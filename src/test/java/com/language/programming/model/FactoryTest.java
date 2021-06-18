package com.language.programming.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.language.programming.model.enumerations.*;

public class FactoryTest {

    private Character character = new Character("Azog", Race.ORC);

    @Test
    public void shouldBuildWeapon() {
        Blacksmith blacksmith = new Factory().getHumanBlacksmith();
        character.setWeapon(blacksmith.forge(WeaponType.SWORD));
        assertNotNull(character.getWeapon());
    }

}
