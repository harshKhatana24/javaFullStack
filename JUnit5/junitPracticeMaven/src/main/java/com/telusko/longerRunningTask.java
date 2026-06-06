package com.telusko;

import java.util.Arrays;

public class longerRunningTask {

    public int[] sortingArray(int[] array){
        for(int i=0;i<10_00_000;i++){
            Arrays.sort(array);
        }
        return array;
    }

}
