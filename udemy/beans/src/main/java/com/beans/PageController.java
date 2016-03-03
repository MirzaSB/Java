package com.beans;

import com.abc.foo.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {

    //@Autowired
    private NotificationService notificationService;

    @Value("${pageController.msg}")
    private String pageControllerMsgFromProperties;

    @Value("${my.secret}")
    private String mySecret;

    @Autowired
    public PageController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @RequestMapping("/")
    public String home() {
        //return notificationService.toString();
        //return pageControllerMsgFromProperties;
        return mySecret;
    }
}
