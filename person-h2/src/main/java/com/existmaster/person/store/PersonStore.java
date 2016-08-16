package com.existmaster.person.store;

import com.existmaster.person.entity.Person;

/**
 * Created by existmaster on 2016. 8. 16..
 */
public interface PersonStore {
    void create(Person person);
    Person read(String id);
}
