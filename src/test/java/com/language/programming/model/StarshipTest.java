package com.language.programming.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StarshipTest {

  @Test
  public void shouldReturnSpaceshipName() {

    Starship.getInstance().setName("USS Enterprise");
    assertEquals("USS Enterprise", Starship.getInstance().getName());
  }

  @Test
  public void shouldReturnSpaceshipCrewNumber() {

    Starship.getInstance().setCrewNumber(20);
    assertEquals(20, Starship.getInstance().getCrewNumber());
  }
}
