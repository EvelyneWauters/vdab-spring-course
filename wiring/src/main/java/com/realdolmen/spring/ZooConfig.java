package com.realdolmen.spring;

import com.realdolmen.spring.domain.Animal;
import com.realdolmen.spring.domain.Bear;
import com.realdolmen.spring.domain.Elephant;
import com.realdolmen.spring.domain.Tiger;
import com.realdolmen.spring.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cda5732 on 25/03/2015.
 */
@Configuration
@ComponentScan
public class ZooConfig {
    @Bean
    public Zoo zoo() {
        Zoo zoo = new PairiDaiza("Pairi Daiza");
        zoo.addAnimal(new Tiger("Bengal Tiger"));
        zoo.addAnimal(new Elephant("Indian Elephant"));
        zoo.addAnimal(new Bear("Brown Bear"));
        return zoo;
    }


    // TODO Configure the FoodRepository
    @Bean
    public FoodRepository foodRepository()  {
        FoodRepository foodRepository = new FoodRepositoryImpl();
        foodRepository.addFoodForAnimalType(Bear.class, new MeatyFood());
        foodRepository.addFoodForAnimalType(Tiger.class, new MeatyFood());
        foodRepository.addFoodForAnimalType(Elephant.class, new VeggieFood());
        return foodRepository;
    }


}
