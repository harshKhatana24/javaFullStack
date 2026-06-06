package com.telusko;

import org.junit.jupiter.api.*;

import static junit.framework.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;



//@TestInstance(TestInstance.Lifecycle.PER_METHOD) //for every test method the instance is get created
    //if there 100 methods -> 100 times the instance of class is created


@TestInstance(TestInstance.Lifecycle.PER_CLASS)//once for class
    //iss case mea contructor phele call hoge BeforeAll se
    //aur is case mea inme static lagane ki jrurat bhi nhi hai
class ShapesTest {

    Shapes shapes=new Shapes();

    public ShapesTest() {
        System.out.println("test object is created before all the test cases");
    }

    @Test
    void testComputeSquareArea(){
        assertEquals("there is some logic issue",
                576.0,shapes.computeSquareArea(24));
        System.out.println("actual test running...");


    }


    @Test
    void  computeRectangleAreaTest(){
        double expectedValue=4;
        double actualValue=shapes.computeRectangleArea(2,2);
        assertEquals("logic is not correct",expectedValue,actualValue);
        System.out.println("actual test running...");

    }




    /*
    * something which is common for all the cases
    * like database cases and all
    * */


    @BeforeEach//before each it will be executed -> ex. 2 times
    void inti_(){
        System.out.println("before test");
    }

    @AfterEach//before each it will be executed -> ex. 2 times
    void destroy (){
        System.out.println("clean up");
    }


    @BeforeAll
    void beforeAll(){ //static method must
        //if using PER_CLASS - no need for static smae for AfterAll
        System.out.println("Before All Test");
    }

    @AfterAll
    static void afterAll(){ //static method must
        System.out.println("After All Test");
    }


}