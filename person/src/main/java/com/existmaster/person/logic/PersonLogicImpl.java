package com.existmaster.person.logic;

import com.existmaster.person.entity.Person;
import com.existmaster.person.store.mongo.PersonStoreMongoImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by existmaster on 2016. 8. 9..
 */
@Service
public class PersonLogicImpl implements PersonLogic {

    public static final Logger logger = LoggerFactory.getLogger(PersonLogicImpl.class);

    @Autowired
    PersonStoreMongoImpl personStore;

    @Override
    public void RegistrationPerson(String id, String name,String domain) {
        logger.debug("RegistrationPerson");
        Person p = new Person(id, name, domain);
        personStore.create(p);
    }

    @Override
    public Person findPerson(String id) {
        logger.debug("findPerson");
        return personStore.read(id);
    }

    @Override
    public List<Person> findByDomainPerson(String domain) {
        return personStore.findByDomain(domain);
    }
}
