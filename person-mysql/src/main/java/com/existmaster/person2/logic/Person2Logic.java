package com.existmaster.person2.logic;

import com.existmaster.person2.entity.Person2;

/**
 * Created by existmaster on 2016. 8. 5..
 */
public interface Person2Logic {

    void RegistrationPerson(String id, String name);
    Person2 findPerson(String id);
}
