package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mbaig on 2/22/16.
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "Hello DevTools2!";
    }

}
