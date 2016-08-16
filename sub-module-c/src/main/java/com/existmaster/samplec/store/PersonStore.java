package com.existmaster.samplec.store;

import com.existmaster.samplec.entity.Person;

/**
 * Created by existmaster on 2016. 8. 16..
 */
public interface PersonStore {
    void create(Person person);
    Person read(String id);
}
