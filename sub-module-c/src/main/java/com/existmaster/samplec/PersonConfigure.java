package com.existmaster.samplec;

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
public class PersonConfigure {
    public static void main(String[] args) {
        SpringApplication.run(PersonConfigure.class, args);
    }

}