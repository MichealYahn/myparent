package com.reye.controller;

import com.reye.configuration.AutoConfig;
import com.reye.configuration.GitConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Autowired private GitConfig gitConfig;
    @Autowired private AutoConfig autoConfig;

    @RequestMapping("/git")
    public Object git(){
        return gitConfig;
    }

    @RequestMapping("/aut")
    public Object auto(){
        return autoConfig;
    }
}
