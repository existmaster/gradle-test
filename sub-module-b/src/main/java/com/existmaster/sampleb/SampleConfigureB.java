package com.existmaster.sampleb;

import com.existmaster.samplec.SampleConfigureC;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by existmaster on 2016. 8. 5..
 */
@Configuration
@ComponentScan
//@Import(SampleConfigureC.class)
@EnableAutoConfiguration
public class SampleConfigureB {
    public static void main(String[] args) {
        SpringApplication.run(SampleConfigureB.class, args);
    }
}
