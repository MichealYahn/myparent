package com.reye.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GitConfig {

    @Value("${msg.hello}")
    private String hello;

    @Value("${msg.nihao}")
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
