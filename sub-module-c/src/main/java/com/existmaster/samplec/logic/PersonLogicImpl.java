package com.existmaster.samplec.logic;

import com.existmaster.samplec.entity.Person;
import com.existmaster.samplec.store.PersonStoreImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by existmaster on 2016. 8. 9..
 */
@Service
public class PersonLogicImpl implements PersonLogic {

    @Autowired
    PersonStoreImpl personStore;

    @Override
    public void RegistrationPerson(String id, String name) {
        Person p = new Person(id, name);
        personStore.create(p);
    }

    @Override
    public Person findPerson(String id) {
        return personStore.read(id);
    }
}
