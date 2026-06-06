package com.telusko;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class testAssertTrue {


    @Test
    void test()
    {
        String str="JUnit5";
        assertTrue(str.equals("JUnit5"));
    }
}
