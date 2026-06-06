package com.telusko.dao;


public class junitCourse implements Course {
    @Override
    public boolean coursePurchased() {
        System.out.println("junit course is purchased");
        return true;
    }
}
