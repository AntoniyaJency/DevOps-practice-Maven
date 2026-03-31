package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.demo.model.User;
import org.springframework.ui.Model;

@Controller
public class UserController {

    @GetMapping("/")
    public String show(Model model) {
        User m = new User();
        model.addAttribute("msg",m.message()); // add to model

        

        return "view"; // goes to view.html
    }
}