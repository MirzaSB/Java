package com.thymaleaf_demo.com.thymaleaf_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/")
    public String home() {
        return "index";
    }

}
