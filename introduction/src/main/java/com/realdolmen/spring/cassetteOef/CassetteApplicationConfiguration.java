package com.realdolmen.spring.cassetteOef;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by jeansmits on 09/06/15.
 */
public class CassetteApplicationConfiguration {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(CassetteConfig.class);
        Cassette cassette = context.getBean(Cassette.class);
        cassette.play();


        context.close();
    }
}
