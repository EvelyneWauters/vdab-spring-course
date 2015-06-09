package com.realdolmen.spring.domain;

/**
 * Created by jeansmits on 09/06/15.
 */
public class Aardvark extends Animal {
    private int jumpCapacity;

    public Aardvark(String name, int jumpCapacity) {
        super(name);
        this.jumpCapacity = jumpCapacity;
    }
}
