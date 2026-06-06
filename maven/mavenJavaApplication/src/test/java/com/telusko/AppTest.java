package com.telusko;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class AppTest {

    @Test
    void testCalc(){
        Calc calc=new Calc();
        int actualResult= calc.divide(10,5);
        int expectedResult=2;

        assertEquals(expectedResult,actualResult);

    }

}
