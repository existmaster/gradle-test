package com.existmaster.samplec.store.jpa;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by existmaster on 2016. 8. 16..
 */
@Entity
public class PersonDataObject {

    @Id
    private String id;

    private String name;

    public PersonDataObject() {
    }

    public PersonDataObject(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
