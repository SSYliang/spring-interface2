package com.interfacetest.interfacetest2.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

public class MyInitializingBean {
}
//@Component
//public class MyInitializingBean implements InitializingBean {
//
//    public MyInitializingBean() {
//        System.out.println("我是MyInitializingBean构造方法执行...");
//    }
//
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("我是afterPropertiesSet方法执行...");
//    }
//
//    @PostConstruct
//    public void postConstruct() {
//        System.out.println("我是postConstruct方法执行...");
//    }
//
//    public void init(){
//        System.out.println("我是init方法执行...");
//    }
//
//    @Bean(initMethod = "init")
//    public MyInitializingBean test() {
//        return new MyInitializingBean();
//    }
//}

