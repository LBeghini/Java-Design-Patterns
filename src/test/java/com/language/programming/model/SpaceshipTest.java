package com.language.programming.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SpaceshipTest {

  @Test
  public void shouldReturnSpaceshipName() {

    Spaceship.getInstance().setName("USS Enterprise");
    assertEquals("USS Enterprise", Spaceship.getInstance().getName());
  }

  @Test
  public void shouldReturnSpaceshipCrewNumber() {

    Spaceship.getInstance().setCrewNumber(20);
    assertEquals(20, Spaceship.getInstance().getCrewNumber());
  }
}
