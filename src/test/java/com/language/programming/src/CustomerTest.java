package com.language.programming.src;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {

    @Test
    public void shouldReturnBankContingent() {
        Customer customer = new Customer();
        Bank.getInstance().addContingent(customer);
        assertEquals(false, customer.isLoanAvailable());
    }

    public void shouldReturnCreditContingent() {
        Customer customer = new Customer();
        Credit.getInstance().addContingent(customer);
        assertEquals(false, customer.isLoanAvailable());
    }

    public void shouldReturnCreditAndBankContingent() {
        Customer customer = new Customer();
        Bank.getInstance().addContingent(customer);
        Credit.getInstance().addContingent(customer);
        assertEquals(false, customer.isLoanAvailable());
    }

    public void shouldLoanBeAvailable() {
        Customer customer = new Customer();
        assertEquals(true, customer.isLoanAvailable());
    }

}
