package com.existmaster.person.store.mongo;

import org.springframework.data.annotation.Id;

/**
 * Created by existmaster on 2016. 8. 16..
 */

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
