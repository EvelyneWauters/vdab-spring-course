package com.realdolmen.spring.service;

import com.realdolmen.spring.domain.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FoodDistributionServiceImpl implements FoodDistributionService {
    @Autowired
    private FoodRepository foodRepository;


    public FoodDistributionServiceImpl(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }


    public FoodDistributionServiceImpl() {
    }

    @Override
    public void feedAnimalsByType(List<Animal> animals) {
        for (Animal animal : animals) {
            Food foodForAnimalType = foodRepository.findFoodForAnimalType(animal.getClass());
            animal.feed(foodForAnimalType);
            System.out.println(animal +" is eating " + foodForAnimalType);
        }
    }
}
