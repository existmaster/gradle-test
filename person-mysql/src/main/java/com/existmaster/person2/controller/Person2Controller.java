package com.existmaster.person2.controller;

import com.existmaster.person2.entity.Person2;
import com.existmaster.person2.logic.Person2Logic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by existmaster on 2016. 8. 4..
 */
@RestController
@RequestMapping("/person2")
public class Person2Controller {

    @Autowired
    Person2Logic person2Logic;

    @RequestMapping(method = RequestMethod.POST)
    public String registrationPerson(@RequestBody Person2TransformObject p) {
        person2Logic.RegistrationPerson(p.getId(), p.getName());
        return "Success!";
    }

    @RequestMapping("/{id}")
    public Person2 findPerson(@PathVariable String id) {
        return person2Logic.findPerson(id);
    }
}