package com.existmaster.person.controller;

/**
 * Created by existmaster on 2016. 8. 16..
 */
public class PersonTransformObject {

    private String id;
    private String name;
    private String domain;

    public PersonTransformObject() {
    }

    public PersonTransformObject(String id, String name, String domain) {
        this.id = id;
        this.name = name;
        this.domain = domain;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
}
