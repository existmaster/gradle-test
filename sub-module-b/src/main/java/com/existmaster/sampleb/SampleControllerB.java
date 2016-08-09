package com.existmaster.sampleb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by existmaster on 2016. 8. 4..
 */
@Controller
@RequestMapping("/sampleb")
public class SampleControllerB{

    @Autowired
    SampleServiceB sampleServiceB;

    @RequestMapping("/b")
    @ResponseBody
    String home() {
        return sampleServiceB.methodA();
    }

}