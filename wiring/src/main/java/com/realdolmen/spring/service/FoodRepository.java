package com.realdolmen.spring.service;

import com.realdolmen.spring.domain.Animal;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jeansmits on 09/06/15.
 */
public interface FoodRepository {

    void addFoodForAnimalType(Class<? extends Animal> animaltype, Food food);
    Food findFoodForAnimalType(Class<? extends Animal> animaltype);
}
