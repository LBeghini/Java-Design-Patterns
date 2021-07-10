package com.language.programming.model;

import com.language.programming.model.enumerations.Role;

public class Waiter extends Employee {

    public Waiter(String name) {
        super(name, Role.WAITER);
    }

    @Override
    public String serve() {
        return "How can I serve you today?";
    }

}
