package com.example.movies;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;






@RestController
public class MoviesController {

    @GetMapping("/path")
    public String getMethodName() {
        return new String("hello");
    }
    

    @RequestMapping("/")
    public String movies() {
        return "Hello world";
    }
    
    
}
