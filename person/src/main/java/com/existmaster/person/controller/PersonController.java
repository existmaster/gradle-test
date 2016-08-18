package com.existmaster.person.controller;

import com.existmaster.person.entity.Person;
import com.existmaster.person.logic.PersonLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by existmaster on 2016. 8. 4..
 */
@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonLogic personLogic;

    @RequestMapping(method = RequestMethod.POST)
    public String registrationPerson(@RequestBody PersonTransformObject p) {
        personLogic.RegistrationPerson(p.getId(), p.getName());
        return "Success!";
    }

    @RequestMapping("/{id}")
    public Person findPerson(@PathVariable String id) {
        return personLogic.findPerson(id);
    }
}