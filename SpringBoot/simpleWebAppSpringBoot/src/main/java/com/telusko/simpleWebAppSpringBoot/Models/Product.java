package com.telusko.simpleWebAppSpringBoot;

import lombok.Data;

@Data //lombok -> getter and setters
public class Product {

    private int id;
    private String name;
    private int price;

}
