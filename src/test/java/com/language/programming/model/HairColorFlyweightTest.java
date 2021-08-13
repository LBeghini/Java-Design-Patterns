package com.language.programming.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

public class HairColorFlyweightTest {

    Character character1;
    Character character2;
    Character character3;
    Character character4;

    @BeforeAll
    public void setUp() {
        Character character1 = new Character("Character1", "Brown", "Red", "Purple");
        Character character2 = new Character("Character2", "Red", "Brown", "Blue");
        Character character3 = new Character("Character3", "Green", "Yellow", "Gray");
        Character character4 = new Character("Character4", "Purple", "Gray", "Red");
    }

    @Test
    public void shouldReturnCharacters() {

        assertAll("CharacterList",
                () -> Assertions.assertEquals(character1,
                        "Character:\n name: Character1\n hair color: Brown\n skin color: Red\n eye color: Purple"),
                () -> Assertions.assertEquals(character2,
                        "Character:\n name: Character2\n hair color: Red\n skin color: Brown\n eye color: Blue"),
                () -> Assertions.assertEquals(character3,
                        "Character:\n name: Character3\n hair color: Green\n skin color: Yellow\n eye color: Gray"),
                () -> Assertions.assertEquals(character4,
                        "Character:\n name: Character1\n hair color: Purple\n skin color: Gray\n eye color: Red"));
    }

    @Test
    public void shouldReturnNumberOfInputs() {

        assertEquals(7, ColorFlyweight.getTotalColors());
    }

}
