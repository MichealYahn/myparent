package com.reye.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sender {

    @Autowired private AmqpTemplate rabbitAmqpTemplate;

    public void send(String s){
        rabbitAmqpTemplate.convertAndSend("hello-queue",s);
    }
}
