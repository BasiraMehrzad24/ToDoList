package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class loginPageController {

    @GetMapping("/login")
    public String showLoginPage() {
        return "redirect:/login.html";


        // Redirect to the static resource
    }
}
