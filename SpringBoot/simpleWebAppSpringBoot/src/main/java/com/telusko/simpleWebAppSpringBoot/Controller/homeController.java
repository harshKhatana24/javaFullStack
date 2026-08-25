package com.telusko.simpleWebAppSpringBoot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
//@Controller
public class homeController {

//    @GetMapping("/home")
    @RequestMapping("/home")
    public String home(){
        return "home";
    }

    @RequestMapping("/about")
    public String about(){
        return "we don't say...we build";
    }

}
