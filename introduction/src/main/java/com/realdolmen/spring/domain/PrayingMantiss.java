package com.realdolmen.spring.domain;

/**
 * Created by jeansmits on 09/06/15.
 */
public class PrayingMantiss extends Animal {
    private boolean religion;

    public PrayingMantiss(String name, boolean religion) {
        super(name);
        this.religion = religion;
    }
}
