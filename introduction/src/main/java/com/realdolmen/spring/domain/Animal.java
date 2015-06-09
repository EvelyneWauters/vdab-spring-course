package com.realdolmen.spring.domain;

/**
 * Created by jeansmits on 09/06/15.
 */
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
