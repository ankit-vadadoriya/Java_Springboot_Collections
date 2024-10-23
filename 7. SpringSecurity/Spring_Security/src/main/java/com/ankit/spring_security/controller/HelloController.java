package com.ankit.spring_security.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping({"/hello", "/"})
    public String greet(HttpServletRequest request){
//        return "Hello World : " + request.getSession().getId();
        return "Hello World";
    }
    @GetMapping("about")
    public String about(HttpServletRequest request){
            return "About page : " + request.getSession().getId();
    }

}