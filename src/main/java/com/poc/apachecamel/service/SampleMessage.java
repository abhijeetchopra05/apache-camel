package com.poc.apachecamel.service;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("sampleMessage")
public class SampleMessage {

    @Value("${message}")
    private String key;

    public String sayHello() {
        return key;
    }

}
