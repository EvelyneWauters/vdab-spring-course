package com.realdolmen.spring.config;

import com.realdolmen.spring.domain.Aardvark;
import com.realdolmen.spring.domain.Animal;
import com.realdolmen.spring.domain.PrayingMantiss;
import com.realdolmen.spring.domain.Sloth;
import com.realdolmen.spring.service.KrugerPark;
import com.realdolmen.spring.service.Zoo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class ZooConfig {
    //Configure the Zoo implementation as a bean, give it a name with its constructor and
    //add some "exotic" animals

    @Bean
    public Zoo zoo()    {
        Zoo krugerPark = new KrugerPark("KrugerPark");
        krugerPark.addAnimal(new Sloth("Billie"));
        krugerPark.addAnimal(new PrayingMantiss("Sheldon", true));
        krugerPark.addAnimal(new Aardvark("Babe",8));

        return krugerPark;
    }

    @Bean
    public Animal animal()  {
        return new Sloth("name");
    }
}
