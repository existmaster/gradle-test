package com.existmaster.person2.store;

import com.existmaster.person2.entity.Person2;

/**
 * Created by existmaster on 2016. 8. 16..
 */
public interface Person2Store {
    void create(Person2 person2);
    Person2 read(String id);
}
