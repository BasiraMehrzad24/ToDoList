package com.example.To_Do_List.controller;

import com.example.To_Do_List.model.User;
import com.example.To_Do_List.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login() {
        return "login"; // This corresponds to login.html in `resources`
    }

    @PostMapping("/register")
    public String register(@RequestParam String first_name, @RequestParam String last_name, @RequestParam String email, @RequestParam String password) {
        User user = new User();
        user.setFirst_name(first_name);
        user.setLast_name(last_name);
        user.setEmail(email);
        user.setPassword(password);
        userService.saveUser(user);
        return "redirect:/login";
    }
}
