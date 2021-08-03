package com.language.programming.src;

public class Bank extends Department {

    private static Bank instance = new Bank();

    public static Bank getInstance() {
        return instance;
    }

}
