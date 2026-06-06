package com.telusko;

import com.telusko.dao.javaCourse;
import com.telusko.dao.junitCourse;
import com.telusko.service.purchaseCourse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class purchaseTest {
    purchaseCourse course=new purchaseCourse();

    @Test
    void test(){
        course.proceedWithCourse(new javaCourse());
    }

    @Test
    void test1(){
        boolean status=course.proceedWithCourse(new junitCourse());
        assertTrue(status);
    }


    //assertFalse
    @Test
    void test3(){ //Supplier functional interface
        assertFalse(true,
                ()->"its failed bcz unit is resulted in true");
    }

}
