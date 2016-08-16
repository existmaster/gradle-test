package com.existmaster.person2.logic;

import com.existmaster.person2.entity.Person2;
import com.existmaster.person2.store.jpa.Person2StoreJPAImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by existmaster on 2016. 8. 9..
 */
@Service
public class Person2LogicImpl implements Person2Logic {

    @Autowired
    Person2StoreJPAImpl personStore;

    @Override
    public void RegistrationPerson(String id, String name) {
        Person2 p = new Person2(id, name);
        personStore.create(p);
    }

    @Override
    public Person2 findPerson(String id) {
        return personStore.read(id);
    }
}
