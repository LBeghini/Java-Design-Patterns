package com.language.programming.src.factories;

import com.language.programming.src.AbstractFactory;
import com.language.programming.src.Chair;
import com.language.programming.src.Couch;
import com.language.programming.src.objects.FabricChair;
import com.language.programming.src.objects.FabricCouch;

public class FabricFactory implements AbstractFactory {

    @Override
    public Chair buildChair() {
        return new FabricChair();
    }

    @Override
    public Couch buildCouch() {
        return new FabricCouch();
    }

}
