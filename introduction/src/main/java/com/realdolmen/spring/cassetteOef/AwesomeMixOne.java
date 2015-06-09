package com.realdolmen.spring.cassetteOef;

import org.springframework.stereotype.Component;

@Component
public class AwesomeMixOne implements Cassette{

    @Override
    public void play() {
        System.out.println("play that funky music white boy");
    }


}
