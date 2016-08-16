package com.existmaster.person2.store.jpa;

import com.existmaster.person2.entity.Person2;
import com.existmaster.person2.store.Person2Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by existmaster on 2016. 8. 16..
 */
@Repository
public class Person2StoreJPAImpl implements Person2Store {

    @Autowired
    Person2Repository person2Repository;

    public void create(Person2 person2) {
        Person2DataObject p = personToDataObject(person2);
        person2Repository.save(p);
    }

    public Person2 read(String id) {
        Person2DataObject p = person2Repository.findOne(id);
        return DataObjectToPerson(p);
    }

    private Person2DataObject personToDataObject(Person2 person2){
        if(person2 == null) return null;
        return new Person2DataObject(person2.getId(), person2.getName());
    }

    private Person2 DataObjectToPerson(Person2DataObject person2DataObject) {
        if(person2DataObject == null) return null;
        return new Person2(person2DataObject.getId(), person2DataObject.getName());
    }
}
