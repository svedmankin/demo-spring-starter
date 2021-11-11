package com.example.demospringbootstarter.service;

import com.example.demospringbootstarter.config.AppProperties;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    private final AppProperties props;

    public MyService(AppProperties props) {
        this.props = props;
    }

    public void printHelloMessage() {
        System.out.println(props.getHelloMessage());
    }

    public void printOtherMessage() {
        System.out.println(props.getOther().getMessage());
    }

}
