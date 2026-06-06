package com.telusko;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.*;

public class junitPracticeMavenTest {

    @Test
    public void test()
    {
        assertEquals(6,3+3);
    }

    @Test
    void testComputeSquareArea(){
        Shapes shapes=new Shapes();
        assertEquals("there is some logic issue",
                576.0,shapes.computeSquareArea(24));

    }






}
