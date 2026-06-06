package com.telusko.gradlesampleapplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/shg")
    String getInfo(){
        return "Veer SHG";
    }

}
