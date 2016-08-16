package com.existmaster.sampleb;

import com.existmaster.samplec.entity.Person;
import com.existmaster.samplec.logic.PersonLogic;
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
    PersonLogic personLogic;

    @RequestMapping("/b")
    @ResponseBody
    Person home() {
        return personLogic.findPerson("existmaster");
    }

}