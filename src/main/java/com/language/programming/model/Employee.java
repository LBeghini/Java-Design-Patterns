package com.language.programming.model;

import com.language.programming.model.enumerations.Role;

public abstract class Employee {

    private String name;
    private Role role;

    public Employee(String name, Role role) {
        this.name = name;
        this.role = role;
    }

    public abstract String serve();

    public String introduce() {
        return "Hello, my name is " + this.name + " and I am a " + this.role.toString() + ". " + this.serve();
    }

}
