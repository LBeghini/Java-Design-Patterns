package com.language.programming.model;

import com.language.programming.model.enumerations.Role;

public class Cooker extends Employee {

    public Cooker(String name) {
        super(name, Role.COOKER);
    }

    @Override
    public String serve() {
        return "Is there any problem with your food?";
    }

}
