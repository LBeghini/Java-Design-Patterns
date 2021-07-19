package com.language.programming.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class PersonTest {

    Person person;

    @BeforeEach
    private void setUp() {
        person = new Person();
    }

    @Test
    public void shouldReturnPedestrianPath() {
        person.walk();
        assertEquals(person.getPath(), "Shortest walking path");
    }

    @Test
    public void shouldReturnCarPath() {
        person.drive();
        assertEquals(person.getPath(), "Shortest driving path");
    }

    @Test
    public void shouldReturnBicyclePath() {
        person.rideBike();
        assertEquals(person.getPath(), "Shortest cycling path");
    }

}
