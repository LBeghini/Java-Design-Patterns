package com.language.programming.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.language.programming.model.decorations.*;

public class CakeTest {

    @Test
    public void shouldReturnCake() {
      CakePan cake = new Cake();

      assertEquals("Cake", cake.getAdornmentStructure());

    }

    @Test
    public void shouldReturnButtercreamCake() {
      CakePan cake = new Buttercream(new Cake());

      assertEquals("Cake/Buttercream", cake.getAdornmentStructure());

    }

    @Test
    public void shouldReturnGanacheCake() {
      CakePan cake = new Ganache(new Cake());

      assertEquals("Cake/Ganache", cake.getAdornmentStructure());

    }

    @Test
    public void shouldReturnMeringueCake() {
      CakePan cake = new Meringue(new Cake());

      assertEquals("Cake/Meringue", cake.getAdornmentStructure());

    }

    @Test
    public void shouldReturnMousseCake() {
      CakePan cake = new Mousse(new Cake());

      assertEquals("Cake/Mousse", cake.getAdornmentStructure());

    }

    @Test
    public void shouldReturnGanacheMousseCake() {
      CakePan cake = new Mousse(new Cake());

      assertEquals("Cake/Mousse", cake.getAdornmentStructure());

    }
    
    
}
