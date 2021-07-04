package com.language.programming.model;

public class Cashier {

    public static Float checkout(ShoppingBasket shoppingBasket) {
        Float total = 0f;

        Screen.promptBanner();

        for (Item item : shoppingBasket) {
            Screen.promptItem(item);
            total += item.getPrice();
        }
        Screen.promptTotal(total);
        return total;
    }

}
