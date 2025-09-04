package com.example.demo.controller;

import com.example.demo.model.UserForm;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ViewController {

    @GetMapping("/view")
    public String showView(Model model) {
        List<String> items = List.of("Élément 1", "Élément 2", "Élément 3");
        model.addAttribute("items", items);

        // новый объект формы (для отображения пустых полей)
        model.addAttribute("userForm", new UserForm());

        return "view";
    }

    @PostMapping("/view")
    public String submitForm(@Valid @ModelAttribute("userForm") UserForm userForm,
                             BindingResult bindingResult,
                             Model model) {
        List<String> items = List.of("Élément 1", "Élément 2", "Élément 3");
        model.addAttribute("items", items);

        if (bindingResult.hasErrors()) {
            // Если есть ошибки — остаёмся на странице и показываем их
            return "view";
        }

        String message = "Bienvenue, " + userForm.getName() + " ! Vous avez " + userForm.getAge() + " ans.";
        model.addAttribute("message", message);

        return "view";
    }
}
