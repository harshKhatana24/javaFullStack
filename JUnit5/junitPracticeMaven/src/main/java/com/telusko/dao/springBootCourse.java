package com.telusko.dao;


public class springBootCourse implements Course {
    @Override
    public boolean coursePurchased() {
        System.out.println("spring boot course is purchased");
        return true;
    }
}
