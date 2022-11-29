package org.example.ss.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class IndexController {

    @GetMapping("index")
    public String index(){
        LocalDateTime localDateTime = LocalDateTime.now();
        return "Hello, now is " + localDateTime;
    }
}
