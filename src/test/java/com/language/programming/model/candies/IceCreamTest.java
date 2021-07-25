package com.language.programming.model.candies;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.language.programming.model.Candy;
import com.language.programming.model.Flavor;
import com.language.programming.model.flavors.Chocolate;
import com.language.programming.model.flavors.Strawberry;

import org.junit.jupiter.api.BeforeEach;

public class IceCreamTest {

    Candy iceCream;

    @BeforeEach
    public void setup() {
        iceCream = new IceCream();
    }

    @Test
    public void shouldReturnChocolateIceCream() {
        Flavor flavor = new Chocolate();
        iceCream.setFlavor(flavor);
        assertEquals(50f, iceCream.getSugar());
    }

    @Test
    public void shouldReturnStrawberryIceCream() {
        Flavor flavor = new Strawberry();
        iceCream.setFlavor(flavor);
        assertEquals(50f, iceCream.getSugar());
    }

}
