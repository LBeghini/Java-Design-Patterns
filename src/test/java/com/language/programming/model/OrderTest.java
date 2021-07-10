package com.language.programming.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.language.programming.model.enumerations.OrderType;

import org.junit.jupiter.api.BeforeEach;

public class OrderTest {

    Waiter waiter;
    KitchenAssistant kitchenAssistant;
    Chef chef;

    @BeforeEach
    void setUp() {
        chef = new Chef(null);
        kitchenAssistant = new KitchenAssistant(chef);
        waiter = new Waiter(kitchenAssistant);
    }

    @Test
    public void shouldReturnMenu() {
        assertEquals("📖", waiter.order(OrderType.MENU));
    }

    @Test
    public void shouldReturnDish() {
        assertEquals("🍽️", waiter.order(OrderType.DISH));
    }

    @Test
    public void shouldReturnMeal() {
        assertEquals("🍲", waiter.order(OrderType.MEAL));
    }

}
