package com.realdolmen.spring.repository;

import com.realdolmen.spring.domain.Animal;

import java.util.List;

public class JpaAnimalRepository implements AnimalRepository {
    @Override
    public void create(Animal animal) {

    }

    @Override
    public Animal findById(int id) {
        return null;
    }

    @Override
    public List<Animal> findAll() {
        return null;
    }

    @Override
    public void update(Animal animal) {

    }

    @Override
    public void remove(Animal animal) {

    }
    // TODO: create a transactional repository bean from this class

    // TODO: inject a persistence context

    // TODO: implement AnimalRepository

    // TODO: implement findById()

    // TODO: implement findAll()

    // TODO: implement create()

    // TODO: implement update()

    // TODO: implement delete()
}
