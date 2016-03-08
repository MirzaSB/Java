package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.NotificationService;

@RestController
public class ServiceController {


    private NotificationService notificationService;

    @Autowired
    public ServiceController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @RequestMapping("/service")
    public String home() {
        //return notificationService.returnServiceMsg();
        return notificationService.toString();
    }

    @RequestMapping("/service_msg")
    public String serviceMsg() {
        return notificationService.returnServiceMsg();
    }
}