package com.existmaster.person.store.mongo;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by existmaster on 2016. 8. 16..
 */

@Document(collection = "person")
public class PersonDataObject {

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
