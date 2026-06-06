package com.telusko;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class testArray {
    @Test
    public void test(){
        int []expectedArray={2,4,6,8};
        int []actualArray={4,2,6,8};

        Arrays.sort(actualArray);
        assertArrayEquals(expectedArray,actualArray); //it is checking the data inside the array
//        assertEquals(expectedArray,actualArray); //it will check the refernce element


    }


}
