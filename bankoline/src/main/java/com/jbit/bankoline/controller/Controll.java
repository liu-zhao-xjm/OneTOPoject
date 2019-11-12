package com.jbit.bankoline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controll {
    @RequestMapping("/")
    public String index() {
        return "login";
    }
}
