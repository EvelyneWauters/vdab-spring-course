package com.realdolmen.spring.service;

import com.realdolmen.spring.domain.Animal;

/**
 * Created by jeansmits on 09/06/15.
 */
public interface Zoo {
    public void addAnimal(Animal animal);
    public void releaseAnimal(Animal animal);
    public boolean accept(Visitor visitor);
    public String getName();
    public int countAnimals();


}
