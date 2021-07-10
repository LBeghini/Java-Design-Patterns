package com.language.programming.model;

import com.language.programming.model.enumerations.OrderType;

public class Chef extends Employee {

    public Chef(Employee superior) {
        orderType = OrderType.MEAL;
        setSuperior(superior);
    }

    @Override
    public String getOrder() {
        return "🍲";
    }

}
