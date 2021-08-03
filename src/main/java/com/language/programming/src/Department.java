package com.language.programming.src;

import java.util.ArrayList;
import java.util.List;

public abstract class Department {

    private List<Customer> contingents = new ArrayList<>();

    public void addContingent(Customer customer) {
        this.contingents.add(customer);
    }

    public boolean verifyContingents(Customer customer) {
        return contingents.contains(customer);
    }

}
