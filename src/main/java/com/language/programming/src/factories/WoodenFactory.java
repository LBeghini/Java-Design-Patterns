package com.language.programming.src.factories;

import com.language.programming.src.AbstractFactory;
import com.language.programming.src.Chair;
import com.language.programming.src.Couch;
import com.language.programming.src.objects.WoodenChair;
import com.language.programming.src.objects.WoodenCouch;

public class WoodenFactory implements AbstractFactory {

    @Override
    public Chair buildChair() {
        return new WoodenChair();
    }

    @Override
    public Couch buildCouch() {
        return new WoodenCouch();
    }

}