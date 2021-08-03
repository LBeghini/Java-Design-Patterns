package com.language.programming.src;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {

    @Test
    public void shouldReturnOrderPackage() {
        Box box1 = new Box("Bubble Wrap");

        Box box2 = new Box("Sensitive content");
        Item item21 = new Item("Smartphone");
        box2.addContent(item21);

        Box box3 = new Box("Random content");
        Item item31 = new Item("Book");
        Item item32 = new Item("Shovel");
        box3.addContent(item31);
        box3.addContent(item32);

        Box pack = new Box("Package");
        pack.addContent(box1);
        pack.addContent(box2);
        pack.addContent(box3);

        Order order = new Order();
        order.setPackage(pack);

        assertEquals("Package\n" + "Bubble Wrap\n" + "\n" + "Sensitive content\n" + "Smartphone\n" + "\n"
                + "Random content\n" + "Book\n" + "Shovel\n" + "\n", order.getPackage());
    }

}
