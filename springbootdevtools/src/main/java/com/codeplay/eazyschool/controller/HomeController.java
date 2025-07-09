package com.codeplay.eazyschool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping({ "", "/", "home" })
    public String displayHomePage(Model model) {
        // hear, userName is like a variable having value 'Shubham Kumar'
        model.addAttribute("userName", "Himesh Kumar");
        return "index.html";
    }
}
