package com.existmaster.samplec;

import org.springframework.stereotype.Service;

/**
 * Created by existmaster on 2016. 8. 9..
 */
@Service
public class SampleServiceCImpl implements SampleServiceC{

    @Override
    public String service() {
        return "true";
    }
}
