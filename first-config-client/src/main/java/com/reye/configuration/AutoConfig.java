package com.reye.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "msg")
public class AutoConfig {

    private String hello;
    private String nihao;

    public String getHello () {
        return hello;
    }

    public void setHello (String hello) {
        this.hello = hello;
    }

    public String getNihao () {
        return nihao;
    }

    public void setNihao (String nihao) {
        this.nihao = nihao;
    }
}
