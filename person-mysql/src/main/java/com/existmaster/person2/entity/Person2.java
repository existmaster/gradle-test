package com.existmaster.person2.entity;

/**
 * Created by existmaster on 2016. 8. 16..
 */
public class Person2 {

    String id;
    String name;

    public Person2() {
    }

    public Person2(String id, String name) {
        this.id = id;
        this.name = name;
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
}
