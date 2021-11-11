package com.example.demospringbootstarter.rest;

import com.example.demospringbootstarter.config.AppProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@ConditionalOnWebApplication
@RestController
public class MyServiceController {
    private final AppProperties appProperties;

    public MyServiceController(AppProperties appProperties) {
        this.appProperties = appProperties;
    }

    @GetMapping("/myservice/hello_message")
    public String getHelloMessages() {
        return appProperties.getHelloMessage();
    }

    @GetMapping("/myservice/other_message")
    public String getOtherMessages() {
        return appProperties.getOther().getMessage();
    }
}
