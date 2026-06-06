package com.telusko.dao;



public class javaCourse implements Course {

    @Override
    public boolean coursePurchased() {
        System.out.println("java course is purchased");
        return true;
    }
}
