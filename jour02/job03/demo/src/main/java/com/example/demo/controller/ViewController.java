package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ViewController {

    @GetMapping("/view")
    public String showView(Model model) {

        // Crée une liste d'objets (par exemple, des chaînes)
        List<String> items = List.of("Élément 1", "Élément 2", "Élément 3");

        // Passe la liste au modèle
        model.addAttribute("items", items);

        return "view"; // nom du fichier view.html
    }
}
