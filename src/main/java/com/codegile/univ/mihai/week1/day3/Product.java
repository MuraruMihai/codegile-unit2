package com.codegile.univ.mihai.week1.day3;

public class Product {
    private String cod;
    private String description;
    private int count;

    public String getCod() {
        return cod;
    }

    public String getDescription() {
        return description;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Product(String cod, String desc){
        this.cod = cod;
        this.description = desc;
    }
    public Product(){}
}
