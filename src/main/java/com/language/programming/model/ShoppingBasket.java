package com.language.programming.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ShoppingBasket implements Iterable<Item> {

    private List<Item> items = new ArrayList<Item>();

    public ShoppingBasket(Item... items) {
        this.items = Arrays.asList(items);
    }

    @Override
    public Iterator<Item> iterator() {
        return items.iterator();
    }

}
