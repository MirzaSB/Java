package com.beans;

import com.abc.foo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@ComponentScan({"com.abc.foo", "com.beans"})
@SpringBootApplication
public class BeansApplication {

    @Bean
    public User user(){
        return new User("John", "Smith");
    }

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(BeansApplication.class, args);

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for(String name : beanNames) {
            System.out.println(name);
        }

        System.out.println(ctx.getBean("user").toString());

	}
}
