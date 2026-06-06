package com.telusko;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;


public class assertNotEqualsTestMethod {

    Shapes shapes=new Shapes();

    @Test
    void testComputeSquareArea(){ //if expectation is not equal to reality
        assertNotEquals(5746,shapes.computeSquareArea(24));

    }


    @Test
    //msg -> Supplier functional interface, efficient way
    void  computeRectangleAreaTest_WithMsg(){
        assertNotEquals(56,
                shapes.computeRectangleArea(24,24),
                () -> "msg to dev if testcase fail"); //more efficient
                //lazy evaluation
    }


}
