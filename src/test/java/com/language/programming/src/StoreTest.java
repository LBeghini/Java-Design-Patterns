package com.language.programming.src;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.language.programming.src.factories.FabricFactory;
import com.language.programming.src.factories.WoodenFactory;


public class StoreTest {

    @Test
    public void shouldBuildWoodenChair() {
        AbstractFactory abstractFactory = new WoodenFactory();
        Store store = new Store(abstractFactory);

        assertEquals("Wooden Chair", store.getChair());
    }

    @Test
    public void shouldBuildWoodenCouch() {
        AbstractFactory abstractFactory = new WoodenFactory();
        Store store = new Store(abstractFactory);

        assertEquals("Wooden Couch", store.getCouch());
    }

    @Test
    public void shouldBuildFabricChair() {
        AbstractFactory abstractFactory = new FabricFactory();
        Store store = new Store(abstractFactory);

        assertEquals("Fabric Chair", store.getChair());
    }

    @Test
    public void shouldBuildFabricCouch() {
        AbstractFactory abstractFactory = new FabricFactory();
        Store store = new Store(abstractFactory);

        assertEquals("Fabric Couch", store.getCouch());
    }
    
}
