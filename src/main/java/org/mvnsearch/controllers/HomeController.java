package org.mvnsearch.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    String index(Model model) {
        model.addAttribute("nick", "Jack");
        return "index";
    }
}