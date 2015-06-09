package com.realdolmen.spring.service;

import com.realdolmen.spring.domain.Animal;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

public class FoodRepositoryImpl implements FoodRepository{
    private Map<String, Food> feed = new HashMap<>();

    public FoodRepositoryImpl() {
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
