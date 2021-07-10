package com.language.programming.model;

import com.language.programming.model.enumerations.OrderType;

public class Waiter extends Employee {

    public Waiter(Employee superior) {
        orderType = OrderType.MENU;
        setSuperior(superior);
    }

    @Override
    public String getOrder() {
        return "📖";
    }

}
