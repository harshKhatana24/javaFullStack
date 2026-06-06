package com.telusko.SpringBootMavenApp;

import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
@Service

public class GreetingService implements IGreetingService{

    @Override
    public String generateGreeting() {
        LocalTime time=LocalTime.now();
        int hour=time.getHour();
        if(hour<12)
            return "Good Morning";
        else if (hour<16)
            return "Good Afternoon";
        else if (hour<20)
            return "Good Evening";
        else
            return "Good Night";
    }
}
