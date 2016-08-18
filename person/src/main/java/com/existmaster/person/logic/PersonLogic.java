package com.existmaster.person.logic;

import com.existmaster.person.entity.Person;

/**
 * Created by existmaster on 2016. 8. 5..
 */
public interface PersonLogic {

    void RegistrationPerson(String id, String name);
    Person findPerson(String id);
}
