package com.telusko.springbootrestapi;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class AlienResource {

    @Autowired
    private AlienRepository repository;


//    @RequestMapping("/aliens")
    @GetMapping("/aliens")
    public List<Alien> getAliens(){
        List<Alien> alienList= (List<Alien>) repository.findAll();
        return alienList;
    }

    @GetMapping("/alien/{id}")
    public Optional<Alien> getAlienWithID(@PathVariable int id){
        return repository.findById(id);
    }

    @PostMapping("/alien")
    public Alien creatAlien(@RequestBody Alien alien){
        System.out.println(alien.getId()+" "+alien.getName()+" "+alien.getPoint());
        repository.save(alien);
        return alien;
    }


    @DeleteMapping("/alien/{id}")
    public boolean deleteAlien(@PathVariable int id){
        Optional<Alien> alien = repository.findById(id);

        if(alien.isPresent()){
            repository.delete(alien.get());
            return true;
        }

        return false;
    }

}
