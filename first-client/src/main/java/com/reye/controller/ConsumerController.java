package com.reye.controller;

import com.reye.service.ProductService;
import com.reye.service.Sender;
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

    @GetMapping("/first")
    public Object hello(){
        logger.info("我是来自7001客户端的消息");
        sender.send("我喜欢这个东西");
        return productService.getProduct();
    }

}
