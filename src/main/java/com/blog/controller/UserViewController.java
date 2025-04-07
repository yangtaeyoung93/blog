package com.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserViewController {
    @GetMapping(value = "/login")
    public String login(){
        return "login";
    }

    @GetMapping(value = "/signup")
    public String signup(){
        return "signup";
    }
}
