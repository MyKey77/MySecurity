package com.example.mysecurity.Controller;

import com.example.mysecurity.Auth.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controller_goals {


    private UserService userService;

    public Controller_goals(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = {"/","/home"})
    public String homepage(){return "home";}



}
