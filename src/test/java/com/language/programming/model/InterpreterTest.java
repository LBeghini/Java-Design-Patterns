package com.language.programming.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InterpreterTest {

    @Test
    public void shouldReturnTrueGreatherThan() {
        InterpreterLogicExpressions interpreter = new InterpreterLogicExpressions("6 > 3");
        assertTrue(interpreter.interpret());
    }

    @Test
    public void shouldReturnFalseGreatherThan() {
        InterpreterLogicExpressions interpreter = new InterpreterLogicExpressions("3 > 3");
        assertFalse(interpreter.interpret());
    }

    @Test
    public void shouldReturnTrueLessThan() {
        InterpreterLogicExpressions interpreter = new InterpreterLogicExpressions("6 < 7");
        assertTrue(interpreter.interpret());
    }

    @Test
    public void shouldReturnFalseLessThan() {
        InterpreterLogicExpressions interpreter = new InterpreterLogicExpressions("3 < 3");
        assertFalse(interpreter.interpret());
    }

    @Test
    public void shouldReturnTrueEquals() {
        InterpreterLogicExpressions interpreter = new InterpreterLogicExpressions("6 = 6");
        assertTrue(interpreter.interpret());
    }

    @Test
    public void shouldReturnFalseEquals() {
        InterpreterLogicExpressions interpreter = new InterpreterLogicExpressions("3 = 6");
        assertFalse(interpreter.interpret());
    }

}
