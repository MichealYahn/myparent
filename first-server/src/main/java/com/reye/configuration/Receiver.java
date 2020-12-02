package com.reye.configuration;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(
    bindings = @QueueBinding(
        value = @Queue(value = "${config.mq.queue}",autoDelete = "true"),
        exchange = @Exchange(value = "${config.mq.exchange}",type = ExchangeTypes.TOPIC),
        key = "${config.mq.routing}"
    )
)
public class Receiver {

//    @RabbitListener(queues = {"hello-queue"})
//    public void process(String msg){
//        System.out.println("我收到了消息："+msg);
//    }


    @RabbitHandler
    public void process(String msg){
        System.out.println("我收到了消息："+msg);
    }
}
