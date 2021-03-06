package com.reye.configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "msg")
public class AutoConfig {

    private String hello;

    public String getHello () {
        return hello;
    }

    public void setHello (String hello) {
        this.hello = hello;
    }
}
