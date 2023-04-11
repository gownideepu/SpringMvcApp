package com.example.mvc.controller;

import com.example.mvc.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class MyController {

    @GetMapping("/greeting")
    public String greeting(User user) {
        return "greeting";
    }
}