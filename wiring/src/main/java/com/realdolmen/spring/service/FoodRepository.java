package com.realdolmen.spring.service;

import com.realdolmen.spring.domain.Animal;

import java.util.HashMap;
import java.util.Map;


public interface FoodRepository {

    void addFoodForAnimalType(Class<? extends Animal> animaltype, Food food);
    Food findFoodForAnimalType(Class<? extends Animal> animaltype);
}
