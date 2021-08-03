package com.language.programming.src;

public class Credit extends Department {

    private static Credit instance = new Credit();

    public static Credit getInstance() {
        return instance;
    }

}
