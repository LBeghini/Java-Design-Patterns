package com.language.programming.model;

public class Item {
    private int code;
    private String barcode;
    private String name;
    private Float price;
    private String icon;

    public Item(int code, String barcode, String name, Float price, String icon) {
        this.code = code;
        this.barcode = barcode;
        this.name = name;
        this.price = price;
        this.icon = icon;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
