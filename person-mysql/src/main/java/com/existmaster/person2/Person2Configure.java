package com.existmaster.person2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by existmaster on 2016. 8. 5..
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Person2Configure {
    public static void main(String[] args) {
        SpringApplication.run(Person2Configure.class, args);
    }

}