package com.telusko;

import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.Path;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class AlienRepository {

    List<Alien> alienList=new ArrayList<>();

    public AlienRepository() {

        Alien a1=new Alien();
        a1.setId(101);
        a1.setName("samrat");
        a1.setPoints(10);

        Alien a2=new Alien();
        a2.setId(102);
        a2.setName("Navin Sir");
        a2.setPoints(100);

        alienList.add(a1);
        alienList.add(a2);

    }

    public List<Alien> getAlienList(){
        return alienList;
    }

    public Alien getById(int id){

        return alienList.stream()
                .filter(a -> a.getId()==id)
                .findFirst()
                .orElse(null);
    }


    public Alien createAlien(Alien a){
        System.out.println("adding alien to repo");
        alienList.add(a);
        return a;
    }




    public boolean deleteAlien(int id){
        Alien alien=alienList.stream()
                .filter(a -> a.getId()==id)
                .findFirst()
                .orElse(null);

        boolean del=alienList.remove(alien);

        return del;
    }


}
