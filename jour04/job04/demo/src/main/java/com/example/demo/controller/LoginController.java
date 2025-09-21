package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    //Добавляем контроллер для админа
    @GetMapping("/admin")
    public String admin() {
        return "admin";  // возвращает admin.html
    }

    // Показываем login.html
    @GetMapping("/login")
    public String login() {
        return "login";  // ищет login.html в templates
    }

    // Страница после входа
    @GetMapping("/home")
    public String home() {
        return "view";   //  view.html 
    }
    @GetMapping("/")
    public String index() {
        return "redirect:/home";  // перенаправляет на /home
    }



}

