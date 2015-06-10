package com.realdolmen.spring.service;

import com.realdolmen.spring.domain.Animal;

import java.util.HashMap;
import java.util.Map;


public class TestFoodRepository implements FoodRepository {
    private Map<String, Food> feed = new HashMap<>();

    public TestFoodRepository() {
    }

    @Override
    public void addFoodForAnimalType(Class<? extends Animal> animalType, Food food) {
        feed.put(animalType.getName(), food);
    }

    @Override
    public Food findFoodForAnimalType(Class<? extends Animal> AnimalType) {
        return feed.get(AnimalType.getName());
    }

    public Map<String, Food> getFeed() {
        return feed;
    }
}
