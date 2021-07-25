package com.language.programming.model.candies;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.language.programming.model.Candy;
import com.language.programming.model.Flavor;
import com.language.programming.model.flavors.Chocolate;
import com.language.programming.model.flavors.Strawberry;

import org.junit.jupiter.api.BeforeEach;

public class CakeTest {

    Candy cake;

    @BeforeEach
    public void setup() {
        cake = new Cake();
    }

    @Test
    public void shouldReturnChocolateCake() {
        Flavor flavor = new Chocolate();
        cake.setFlavor(flavor);
        assertEquals(20f, cake.getSugar());
    }

    @Test
    public void shouldReturnStrawberryCake() {
        Flavor flavor = new Strawberry();
        cake.setFlavor(flavor);
        assertEquals(30f, cake.getSugar());
    }

}
