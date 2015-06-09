package com.realdolmen.spring.service;

import com.realdolmen.spring.domain.Animal;

import java.util.ArrayList;
import java.util.List;

public class KrugerPark implements Zoo {
    private String name;
    private List<Animal> animals = new ArrayList<>();

    public KrugerPark(String name) {
        this.name = name;
    }

    @Override
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    @Override
    public void releaseAnimal(Animal animal) {
        animals.remove(animal);
    }

    @Override
    public boolean accept(Visitor visitor) {
        return true;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int countAnimals() {
        return animals.size();
    }
}
