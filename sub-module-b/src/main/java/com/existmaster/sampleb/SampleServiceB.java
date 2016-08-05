package com.existmaster.sampleb;

import com.existmaster.samplec.SampleServiceC;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by existmaster on 2016. 8. 5..
 */
public class SampleServiceB {

    @Autowired
    private SampleServiceC sampleServiceC;

    public void methodA() {
        sampleServiceC.service();
    }
}
