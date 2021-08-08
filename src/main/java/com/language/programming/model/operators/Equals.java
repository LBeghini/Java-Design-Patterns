package com.language.programming.model.operators;

import com.language.programming.model.Interpreter;

public class Equals extends Interpreter {

    public Equals(Integer left, Integer right) {
        super(left, right);
    }

    @Override
    public boolean interpret() {
        return left == right;
    }
}