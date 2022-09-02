package com.interfacetest.interfacetest2.controller;

import com.interfacetest.interfacetest2.event.MyTestEventPubLisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestEventListenerController {

    @Autowired
    private MyTestEventPubLisher publisher;

    @RequestMapping(value = "/test/testPublishEvent1" )
    public void testPublishEvent(){
        publisher.pushListener("我来了！");
    }
}

