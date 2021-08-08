package com.language.programming.model;

public abstract class Interpreter {

    protected Integer left;
    protected Integer right;

    public Interpreter(Integer left, Integer right) {
        this.left = left;
        this.right = right;
    };

    public abstract boolean interpret();

}
