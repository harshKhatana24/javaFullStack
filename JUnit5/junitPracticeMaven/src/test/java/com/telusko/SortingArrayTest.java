package com.telusko;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SortingArrayTest {

    @Test
    void test(){
        SortingArray array = new SortingArray();
//        int unsortedArray[] = null;
//        try {
//            int sortedArray[] = array.sortArray(unsortedArray);
//            System.out.println(Arrays.toString(sortedArray));
//            fail();
//        } catch (NullPointerException e) {
//            System.out.println("Array is not provided ");
//        }



        //or
        int unsortedArray[] = null;
        assertThrows(NullPointerException.class,()->array.sortArray(unsortedArray));


    }

}