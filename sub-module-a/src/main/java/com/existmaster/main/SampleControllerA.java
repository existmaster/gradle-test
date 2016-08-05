package com.existmaster.main;

import com.existmaster.sampleb.SampleConfigureB;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by existmaster on 2016. 8. 4..
 */
@Controller
public class SampleControllerA {

    @RequestMapping("a")
    @ResponseBody
    String home() {
        return "Hello sub-module A";
    }


}
