package com.language.programming.model;

public abstract class CakeDecorator implements CakePan {

    private CakePan cake;
    public String adornment;

    public CakeDecorator(CakePan cake) {
        this.cake = cake;
    }

    public CakePan getCake() {
        return cake;
    }

    public void setCake(CakePan cake) {
        this.cake = cake;
    }

    public abstract String getAdornment();

    public void setAdornment(String adornment) {
        this.adornment = adornment;
    }

    public String getAdornmentStructure() {
        return this.cake.getAdornmentStructure() + "/" + this.getAdornment();
    }

}
