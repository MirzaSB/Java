package service;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    private String SERVICE_MSG = "This is a message from the service";

    public NotificationService() {}

    public void send(){}

    public void sendAsync() {}

    public String returnServiceMsg() {
        return SERVICE_MSG;
    }

    @Override
    public String toString(){
        return "Returning toString";
    }

}
