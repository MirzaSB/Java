package controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${config.property.name}")
    private String propertyName;

    @Value("${config.property2.name}")
    private String propertyName2;

    @RequestMapping("/")
    public String getPropertyName(){
        return propertyName;
    }

    @RequestMapping("/yaml")
    public String getPropertyNameFromYaml(){
        return propertyName2;
    }

}
