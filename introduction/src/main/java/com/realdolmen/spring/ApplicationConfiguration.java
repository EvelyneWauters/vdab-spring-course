package com.realdolmen.spring;

import com.realdolmen.spring.config.ZooConfig;
import com.realdolmen.spring.service.Zoo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by cda5732 on 25/03/2015.
 */
@SpringBootApplication
public class ApplicationConfiguration {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ZooConfig.class);
        // TODO Fetch the Zoo class and print out its name and its animal count
        Zoo zoo = context.getBean(Zoo.class);
        System.out.println(zoo.countAnimals());
        System.out.println(zoo.getName());
        context.close();

        // TODO Test your code by running this main
    }
}
