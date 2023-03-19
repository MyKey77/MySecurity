package com.example.mysecurity.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controller_goals {
    @GetMapping(path = {"/","/home"})
    public String homepage(){return "testing";}



}
