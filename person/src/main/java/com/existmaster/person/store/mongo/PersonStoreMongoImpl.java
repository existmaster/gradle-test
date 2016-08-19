package com.existmaster.person.store.mongo;

import com.existmaster.person.entity.Person;
import com.existmaster.person.store.PersonStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by existmaster on 2016. 8. 16..
 */
@Repository
public class PersonStoreMongoImpl implements PersonStore {

    @Autowired
    PersonRepository personRepository;

    public void create(Person person) {
        PersonDataObject p = personToDataObject(person);
        personRepository.save(p);
    }

    public Person read(String id) {
        PersonDataObject p = personRepository.findOne(id);
        return DataObjectToPerson(p);
    }

    @Override
    public List<Person> findByDomain(String domain) {
        List<PersonDataObject> personDataObjectList = personRepository.findByDomain(domain);
        List<Person> personList = new ArrayList<>();
        for(PersonDataObject p : personDataObjectList){
            personList.add(DataObjectToPerson(p));
        }
        return personList;
    }

    private PersonDataObject personToDataObject(Person person){
        if(person == null) return null;
        return new PersonDataObject(person.getId(), person.getName(), person.getDomain());
    }

    private Person DataObjectToPerson(PersonDataObject personDataObject) {
        if(personDataObject == null) return null;
        return new Person(personDataObject.getId(), personDataObject.getName(), personDataObject.getDomain());
    }
}
