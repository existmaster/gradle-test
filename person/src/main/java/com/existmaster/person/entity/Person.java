package com.existmaster.person.entity;

/**
 * Created by existmaster on 2016. 8. 16..
 */
public class Person {

    String id;
    String name;
    String domain;

    public Person() {
    }

    public Person(String id, String name, String domain) {
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
