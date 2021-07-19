package com.language.programming.model;

import com.language.programming.model.enumerations.Condition;

public class Book {

    private Condition condition;

    public Book() {
        this.condition = Condition.EMPTY;
    }

    public String getCondition() {
        return this.condition.toString();
    }

    public void write() {
        this.condition = Condition.PROGRESS;
    }

    public void erase() {
        this.condition = Condition.REGRESS;
    }

}
