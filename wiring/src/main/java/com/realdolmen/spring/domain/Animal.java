package com.realdolmen.spring.domain;

import com.realdolmen.spring.service.Food;

/**
 * Created by cda5732 on 25/03/2015.
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

    public abstract void feed(Food f);

    // TODO Feed the Animal some Food
}
