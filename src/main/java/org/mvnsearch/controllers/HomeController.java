package org.mvnsearch.controllers;

import io.github.wimdeblauwe.hsbt.mvc.HtmxRequest;
import io.github.wimdeblauwe.hsbt.mvc.HxRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("/")
    String index(Model model) {
        model.addAttribute("nick", "Jack");
        return "index";
    }

    @GetMapping("/partial")
    @HxRequest
    @ResponseBody
    public String htmxRequest(HtmxRequest details) {
        return "good morning";
    }
}