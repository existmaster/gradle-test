package com.existmaster.person2.controller;

/**
 * Created by existmaster on 2016. 8. 16..
 */
public class Person2TransformObject {

    private String id;
    private String name;

    public Person2TransformObject() {
    }

    public Person2TransformObject(String id, String name) {
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
