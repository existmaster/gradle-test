package com.existmaster.sampleb;

import com.existmaster.person.logic.PersonLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by existmaster on 2016. 8. 5..
 */
@Service
public class SampleServiceB {

    @Autowired
    private PersonLogic personLogic;

    public void methodA() {
        personLogic.RegistrationPerson("a", "b");
    }
}
