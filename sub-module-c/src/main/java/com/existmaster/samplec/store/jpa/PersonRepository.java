package com.existmaster.samplec.store.jpa;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by existmaster on 2016. 8. 16..
 */
public interface PersonRepository extends CrudRepository<PersonDataObject, String>{
}
