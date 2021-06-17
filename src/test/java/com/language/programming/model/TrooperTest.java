package com.language.programming.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.language.programming.model.enumerations.*;

public class TrooperTest {

    @Test
    public void shouldSucceedCreateClone() {
        Trooper template = new Trooper("Jango Fett", Specie.HUMAN, Gender.MALE, 1.83f, Color.BLACK, Color.BROWN);
        Trooper clone = template.clone();

        assertAll("Clone", () -> Assertions.assertEquals(template.getName(), clone.getName()),
                () -> Assertions.assertEquals(template.getSpecie(), clone.getSpecie()),
                () -> Assertions.assertEquals(template.getGender(), clone.getGender()),
                () -> Assertions.assertEquals(template.getHeight(), clone.getHeight()),
                () -> Assertions.assertEquals(template.getHairColor(), clone.getHairColor()),
                () -> Assertions.assertEquals(template.getEyeColor(), clone.getEyeColor()));
    }

    @Test
    public void shouldSucceedModifyClone() {
        Trooper template = new Trooper("Jango Fett", Specie.HUMAN, Gender.MALE, 1.83f, Color.BLACK, Color.BROWN);
        Trooper clone = template.clone();
        clone.setName("Bobba Fett");

        assertAll("Clone", () -> Assertions.assertEquals(template.getName(), "Jango Fett"),
                () -> Assertions.assertEquals(clone.getName(), "Bobba Fett"),
                () -> Assertions.assertEquals(template.getSpecie(), clone.getSpecie()),
                () -> Assertions.assertEquals(template.getGender(), clone.getGender()),
                () -> Assertions.assertEquals(template.getHeight(), clone.getHeight()),
                () -> Assertions.assertEquals(template.getHairColor(), clone.getHairColor()),
                () -> Assertions.assertEquals(template.getEyeColor(), clone.getEyeColor()));
    }
}
