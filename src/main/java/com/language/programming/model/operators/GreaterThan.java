package com.language.programming.model.operators;

import com.language.programming.model.Interpreter;

public class GreaterThan extends Interpreter {

    public GreaterThan(Integer left, Integer right) {
        super(left, right);
    }

    @Override
    public boolean interpret() {
        return left > right;
    }
}
