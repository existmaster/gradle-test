package com.existmaster.samplec.logic;

import com.existmaster.samplec.entity.Person;
import org.springframework.stereotype.Service;

/**
 * Created by existmaster on 2016. 8. 5..
 */
public interface PersonLogic {

    public void RegistrationPerson(String id, String name);
    public Person findPerson(String id);
}
