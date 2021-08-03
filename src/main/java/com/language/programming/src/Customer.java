package com.language.programming.src;

public class Customer {

    public boolean isLoanAvailable() {
        return Facade.verifyFinancialDependencies(this);
    }
}
