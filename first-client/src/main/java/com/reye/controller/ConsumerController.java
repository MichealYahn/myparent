package com.reye.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.rabbitmq.tools.json.JSONUtil;
import com.reye.configurations.AutoConfig;
import com.reye.service.ProductService;
import com.reye.service.Sender;
import jdk.nashorn.internal.parser.JSONParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    private static final  Logger logger = LoggerFactory.getLogger(ConsumerController.class);

    @Autowired private ProductService productService;

    @Autowired private Sender sender;

    @Autowired private AutoConfig autoConfig;

    @GetMapping("/first")
    public Object hello(){
        logger.info("我是来自7001客户端的消息");
        sender.send("我喜欢这个东西1");
        System.out.println(autoConfig.getHello());
        return productService.getProduct();
    }

}
