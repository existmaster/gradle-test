package com.existmaster.person2.store.jpa;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by existmaster on 2016. 8. 16..
 */
@Entity
public class Person2DataObject {

    @Id
    private String id;

    private String name;

    public Person2DataObject() {
    }

    public Person2DataObject(String id, String name) {
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
