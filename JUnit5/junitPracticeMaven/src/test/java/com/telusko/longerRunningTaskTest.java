package com.telusko;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class longerRunningTaskTest {

    @Test //this unit is able to pass within 100 ms
    void test(){
        longerRunningTask arry=new longerRunningTask();
        int unsortedArray[]={3,2,1};
        assertTimeout(Duration.ofMillis(100),()->{
            arry.sortingArray(unsortedArray);
        });


    }



}