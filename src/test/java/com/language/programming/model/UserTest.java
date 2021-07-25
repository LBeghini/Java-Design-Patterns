package com.language.programming.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    public void shouldReturnWindowsCommand() {
        User user = new User();
        user.setCommand("dir");

        assertEquals("dir", user.getCommand());
    }

}
