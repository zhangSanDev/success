package com.success.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/ll")
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        System.out.println("eeee");
        return "hello";
    }
}
