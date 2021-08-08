package com.language.programming.model;

import java.util.Arrays;
import java.util.List;

import com.language.programming.model.operators.*;

public class InterpreterLogicExpressions {

    private String expression;

    public InterpreterLogicExpressions(String expression) {
        this.expression = expression;
    }

    public boolean interpret() {
        List<String> elements = Arrays.asList(expression.split(" "));
        Integer left = 0;
        Integer right = 0;
        Interpreter interpreter = null;

        if (elements.size() != 3) {
            throw new IllegalArgumentException();
        }

        try {
            left = Integer.parseInt(elements.get(0));
            right = Integer.parseInt(elements.get(2));

        } catch (Exception e) {
            e.printStackTrace();
        }

        if (elements.get(1).equals(">")) {
            interpreter = new GreaterThan(left, right);
        }

        if (elements.get(1).equals("<")) {
            interpreter = new LessThan(left, right);
        }

        if (elements.get(1).equals("=")) {
            interpreter = new Equals(left, right);
        }

        return interpreter.interpret();
    }

}
