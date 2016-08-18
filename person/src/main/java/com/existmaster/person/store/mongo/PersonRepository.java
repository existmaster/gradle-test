package com.existmaster.person.store.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by existmaster on 2016. 8. 16..
 */
public interface PersonRepository extends MongoRepository<PersonDataObject, String>{

}
