package com.language.programming.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    @Test
    public void shouldIntroduceWaiter() {
        Waiter waiter = new Waiter("NAME");
        assertEquals("Hello, my name is NAME and I am a WAITER. How can I serve you today?", waiter.introduce());
    }

    @Test
    public void shouldIntroduceCooker() {
        Cooker cooker = new Cooker("NAME");
        assertEquals("Hello, my name is NAME and I am a COOKER. Is there any problem with your food?",
                cooker.introduce());
    }
}
