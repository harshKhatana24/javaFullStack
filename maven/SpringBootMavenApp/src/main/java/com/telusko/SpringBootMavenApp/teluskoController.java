package com.telusko.SpringBootMavenApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class teluskoController {

    @Autowired
    private IGreetingService service;


    @GetMapping("/greeting")
    public String genersteWish1(Model model){
        String res=service.generateGreeting();
        model.addAttribute("wish",res);
        return "greet";
    }

}
