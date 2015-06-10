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

    // TODO Feed the Animal some Food
    public void feed(Food f)   {
        System.out.print("omnomnomnom... ");
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + getName() ;
    }

}
