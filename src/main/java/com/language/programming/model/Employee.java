package com.language.programming.model;

import com.language.programming.model.enumerations.OrderType;

public abstract class Employee {

    protected OrderType orderType;
    private Employee superior;

    public Employee getSuperior() {
        return superior;
    }

    public void setSuperior(Employee superior) {
        this.superior = superior;
    }

    public abstract String getOrder();

    public String order(OrderType order) {
        if (orderType == order) {
            return getOrder();
        } else {
            if (superior != null) {
                return superior.order(order);
            } else {
                return "";
            }
        }
    }

}
