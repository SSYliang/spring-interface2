package com.interfacetest.interfacetest2.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitializerController {
    private ApplicationContext applicationContext;
    public InitializerController(ApplicationContext applicationContext){
        this.applicationContext = applicationContext;
    }

    @RequestMapping("/getAttributes")
    public String getAttributes(){
        String value = applicationContext.getEnvironment().getProperty("key1");
        System.out.println(value);
        return value;
    }
}
