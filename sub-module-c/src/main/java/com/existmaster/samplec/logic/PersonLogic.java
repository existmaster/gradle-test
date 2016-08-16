package com.existmaster.samplec.logic;

import com.existmaster.samplec.entity.Person;

/**
 * Created by existmaster on 2016. 8. 5..
 */
public interface PersonLogic {

    void RegistrationPerson(String id, String name);
    Person findPerson(String id);
}
