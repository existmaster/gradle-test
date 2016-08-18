package com.existmaster.person.controller;

import com.existmaster.person.entity.Person;
import com.existmaster.person.logic.PersonLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
        personLogic.RegistrationPerson(p.getId(), p.getName(), p.getDomain());
        return "Success!";
    }

    @RequestMapping(value = "/{id}")
    public Person findPerson(@PathVariable String id) {
        return personLogic.findPerson(id);
    }

    @RequestMapping(value = "/search/{domain}")
    public List<Person> findPersonByDomain(@PathVariable String domain) {
        return personLogic.findByDomainPerson(domain);
    }
}