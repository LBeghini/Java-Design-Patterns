package com.language.programming.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CashierTest {

  @Test
  public void shouldSumItemsPrices() {
    ShoppingBasket shoppingBasket = new ShoppingBasket(
        new Item(3810392, "│  │█ █│█ █│ ||||", "Chocolate Bar", 2.99f, "🍫"),
        new Item(3039483, "████ |||| ██│|  █", "Red Apple", 0.99f, "🍎"),
        new Item(9389348, "│█ █│█  ||||| ███", "Bread", 3.99f, "🍞"),
        new Item(4893023, "||| ████    ██ ||", "Egg", 0.30f, "🥚"),
        new Item(5920334, " █│█  ||||    ███", "Broccoli", 0.90f, "🥦"));

    assertEquals(9.17f, Cashier.checkout(shoppingBasket));
  }
}
