package com.sda.exemplu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class AppConfig {
    @Bean
    public ClassA giveMeA() {
        return new ClassA();
    }

    @Bean
    public ClassB giveMeB() {
        return new ClassB();
    }

    @Bean
    public ClassC giveMeC() {
        return new ClassC();
    }

    @Bean
    public ClassD giveMeD() {
        return new ClassD();
    }


    @Bean
    public ClassE classE() {
        return new ClassE(giveMeA(),giveMeB(), giveMeC(), giveMeD() );
    }

}
