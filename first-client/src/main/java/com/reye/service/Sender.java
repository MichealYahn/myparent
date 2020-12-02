package com.reye.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Sender {

    @Autowired private AmqpTemplate rabbitAmqpTemplate;

    @Value("${config.mq.exchange}")
    private String exchange;

    @Value("${config.mq.routing}")
    private String routingkey;

//    public void send(String s){
//        rabbitAmqpTemplate.convertAndSend("hello-queue",s);
//    }

    public void send(String msg){
        rabbitAmqpTemplate.convertAndSend(exchange,routingkey,msg);
    }
}
