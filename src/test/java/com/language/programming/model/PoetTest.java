package com.language.programming.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.language.programming.model.actions.Erase;
import com.language.programming.model.actions.Write;

import org.junit.jupiter.api.BeforeEach;

public class PoetTest {

    Book book;
    Artist artist;

    @BeforeEach
    void setUp() {
        book = new Book();
        artist = new Artist();

    }

    @Test
    public void shouldWriteBook() {
        Action write = new Write(book);
        artist.executeAction(write);

        assertEquals("Writing...", book.getCondition());
    }

    @Test
    public void shouldEraseBook() {
        Action erase = new Erase(book);
        artist.executeAction(erase);

        assertEquals("Erasing...", book.getCondition());
    }

    @Test
    public void shouldCancelEraseBook() {
        Action write = new Write(book);
        Action erase = new Erase(book);

        artist.executeAction(write);
        artist.executeAction(erase);
        artist.cancelLastAction();

        assertEquals("Writing...", book.getCondition());
    }

}
