package com.existmaster.person.store.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by existmaster on 2016. 8. 16..
 */
public interface PersonRepository extends MongoRepository<PersonDataObject, String>{

    List<PersonDataObject> findByDomain(String domain);
}
