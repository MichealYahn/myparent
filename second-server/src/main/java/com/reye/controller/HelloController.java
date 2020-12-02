package com.reye.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.reye.entities.Product;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello")
    public String hello(){
        //logger.debug("我是来自7002生产者的消息");
        System.out.println(StringUtils.center("我是来自7002生产者的消息",20,"*"));
        return new Product().toString();
    }
    @RequestMapping("/first")
    @ResponseBody
    public Product product(){
        System.out.println(StringUtils.center("我是来自7006生产者的消息",20,"*"));
        return new Product();
    }
}
