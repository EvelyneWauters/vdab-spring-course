package com.realdolmen.spring.domain;

/**
 * Created by jeansmits on 09/06/15.
 */
public class SnowLeopard extends Animal {
    private int spots;

    public SnowLeopard(String name, int spots) {
        super(name);
        this.spots = spots;
    }
}
