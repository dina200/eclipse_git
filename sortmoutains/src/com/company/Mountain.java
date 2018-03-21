package com.company;

public class Mountain {
    private String name;
    private Integer height;

    public Mountain (String name, Integer height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return this.name;
    }

    public Integer getHeight(){
        return this.height;
    }

    @Override
    public String toString() {
        return name + " " + height;
    }
}
