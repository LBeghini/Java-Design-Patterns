package com.language.programming.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class MusicTest {

    Music music;

    @BeforeEach
    public void setUp() {
        music = new Music("Never Gonna Give You Up", "Rick Astley");
    }

    @Test
    public void shouldPause() {
        assertEquals(music.pause(), "⏸");
    }

    @Test
    public void shouldSkip() {
        assertEquals(music.skip(), "⏭️");
    }

    @Test
    public void shouldStop() {
        assertEquals(music.stop(), "⏹️");
    }

    @Test
    public void shouldNotAllowDoublePlayAction() {
        assertEquals(music.play(), "⚠️ Operation not allowed");
    }

    @Test
    public void shouldNotAllowDoublePauseAction() {
        music.pause();
        assertEquals(music.pause(), "⚠️ Operation not allowed");
    }

    @Test
    public void shouldNotAllowDoubleSkipAction() {
        music.skip();
        assertEquals(music.stop(), "⚠️ Operation not allowed");
    }

    @Test
    public void shouldNotAllowDoubleStopAction() {
        music.stop();
        assertEquals(music.skip(), "⚠️ Operation not allowed");
    }

    @Test
    public void shouldNotAllowStopAfterPause() {
        music.pause();
        assertEquals(music.stop(), "⚠️ Operation not allowed");
    }

    @Test
    public void shouldNotAllowActionsAfterSkip() {
        music.skip();

        assertAll("Fail Skip", () -> Assertions.assertEquals(music.play(), "⚠️ Operation not allowed"),
                () -> Assertions.assertEquals(music.pause(), "⚠️ Operation not allowed"),
                () -> Assertions.assertEquals(music.stop(), "⚠️ Operation not allowed"));
    }

    @Test
    public void shouldNotAllowActionsAfterStop() {
        music.stop();

        assertAll("Fail Skip", () -> Assertions.assertEquals(music.play(), "⚠️ Operation not allowed"),
                () -> Assertions.assertEquals(music.pause(), "⚠️ Operation not allowed"),
                () -> Assertions.assertEquals(music.stop(), "⚠️ Operation not allowed"));
    }

}
