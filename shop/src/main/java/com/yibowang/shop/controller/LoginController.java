package com.yibowang.shop.controller;

import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

public class LoginController {
    @GetMapping("/login")
    public String login(Principal principal) {
        if (principal != null) {
            return "redirect:/home";
        }
        return "/login";
    }
}
