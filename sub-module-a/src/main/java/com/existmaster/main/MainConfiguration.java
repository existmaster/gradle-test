package com.existmaster.main;

import com.existmaster.sampleb.SampleConfigureB;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 * Created by existmaster on 2016. 8. 5..
 */
@Import({SampleConfigureB.class})
@EnableAutoConfiguration
@ComponentScan
public class MainConfiguration {

    public static void main(String[] args) {
        SpringApplication.run(MainConfiguration.class, args);
    }

}
