package com.tolet.sajib.inventorydesign.model;

public class Listmodel {
    String name;
    String price;
    public Listmodel(){

    }

    public Listmodel(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
