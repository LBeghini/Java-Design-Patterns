package com.language.programming.model;

import com.language.programming.model.strategies.Bicycle;
import com.language.programming.model.strategies.Car;
import com.language.programming.model.strategies.Pedestrian;

public class Person {

    private String path;

    public String getPath() {
        return path;
    }

    public void walk() {
        App app = new App();
        this.path = app.calculate(new Pedestrian());

    }

    public void drive() {
        App app = new App();
        this.path = app.calculate(new Car());

    }

    public void rideBike() {
        App app = new App();
        this.path = app.calculate(new Bicycle());

    }

}
