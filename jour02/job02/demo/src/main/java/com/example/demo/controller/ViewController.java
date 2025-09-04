package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/view")
    public String showView(Model model) {
        model.addAttribute("message", "Bonjour ! Ceci est un message de Thymeleaf.");
        return "view"; // имя файла view.html
    }
}
