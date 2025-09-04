
package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Value("${greeting.message}")
    private String message;

    @GetMapping("/")
    @ResponseBody
    public String hello() {
        return message;
    }
}