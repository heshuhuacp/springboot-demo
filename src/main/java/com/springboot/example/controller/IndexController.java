package com.springboot.example.controller;

import com.springboot.example.config.BookProperties;
import com.springboot.example.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    private BookProperties bookProperties;

    @Autowired
    private HelloService helloService;

    @RequestMapping("/")
    public String index(){

        return "Hello Spring Boot,Author name is:" + bookProperties.getName()
                + " and author age is:" + bookProperties.getAge();
    }

    @RequestMapping("/hello")
    public String sayHello(){
        return helloService.sayHello();
    }

}
