package com.existmaster.person.logic;

import com.existmaster.person.entity.Person;

import java.util.List;

/**
 * Created by existmaster on 2016. 8. 5..
 */
public interface PersonLogic {

    void RegistrationPerson(String id, String name, String domain);
    Person findPerson(String id);
    List<Person> findByDomainPerson(String domain);
}
