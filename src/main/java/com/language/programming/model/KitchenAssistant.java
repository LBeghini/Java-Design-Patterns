package com.language.programming.model;

import com.language.programming.model.enumerations.OrderType;

public class KitchenAssistant extends Employee {

    public KitchenAssistant(Employee superior) {
        orderType = OrderType.DISH;
        setSuperior(superior);
    }

    @Override
    public String getOrder() {
        return "🍽️";
    }

}
