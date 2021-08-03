package com.language.programming.src;

public class Facade {

    public static boolean verifyFinancialDependencies(Customer customer) {

        if (Bank.getInstance().verifyContingents(customer)) {
            return false;
        }

        if (Credit.getInstance().verifyContingents(customer)) {
            return false;
        }

        return true;
    }
}
