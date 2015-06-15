package com.realdolmen.spring;

import com.realdolmen.spring.domain.Animal;
import com.realdolmen.spring.domain.Food;
import com.realdolmen.spring.repository.AnimalRepository;
import com.realdolmen.spring.repository.FoodRepository;
import com.realdolmen.spring.service.FoodDistributionService;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ZooConfig.class).profiles("production").build().run(args);
        context.getBean(FoodDistributionService.class).feedAllAnimal();

        //zie vorige oef:
        DataSource dataSource = context.getBean(DataSource.class);
        System.out.println(dataSource.getConnection());
    }
}
