package com.language.programming.src;

public class Order {
    private Package pack;

    public void setPackage(Package pack) {
        this.pack = pack;
    }

    public String getPackage() {
        if (this.pack == null) {
            throw new NullPointerException();
        }
        return this.pack.getContent();
    }

}
