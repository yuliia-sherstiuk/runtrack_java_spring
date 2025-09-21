package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ViewController {

    @GetMapping("/view")
    public String showView(Model model) {
        List<String> items = List.of("Élément 1", "Élément 2", "Élément 3");
        model.addAttribute("items", items);
        return "view";
    }

    @PostMapping("/view")
    public String submitForm(@RequestParam("name") String name, Model model) {
        List<String> items = List.of("Élément 1", "Élément 2", "Élément 3");
        model.addAttribute("items", items);

        String message = "Bienvenue, " + name + " !";
        model.addAttribute("message", message);

        return "view";
    }
}
