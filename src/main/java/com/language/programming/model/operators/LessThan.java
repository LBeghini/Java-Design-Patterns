package com.language.programming.model.operators;

import com.language.programming.model.Interpreter;

public class LessThan extends Interpreter {

    public LessThan(Integer left, Integer right) {
        super(left, right);
    }

    @Override
    public boolean interpret() {
        return left < right;
    }
}
