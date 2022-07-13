package com.laurencetuchin.springbootblogapplication.controllers;

import com.laurencetuchin.springbootblogapplication.models.Account;
import com.laurencetuchin.springbootblogapplication.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/register")
    public String getRegisterPage() {
        return "register";
    }

    @PostMapping("/register")
    public String registerNewUser(@ModelAttribute Account account){
        accountService.save(account);

        return "redirect:/";
    }

}
