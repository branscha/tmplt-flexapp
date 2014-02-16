package org.branscha.flexapp;

import org.springframework.flex.remoting.RemotingDestination;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@RemotingDestination("dest-timeservice")
public class TimeService {
    public String fetchTime()
    {
        return new Date().toString();
    }
}
