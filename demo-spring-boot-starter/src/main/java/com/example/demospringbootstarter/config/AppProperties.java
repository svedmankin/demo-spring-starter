package com.example.demospringbootstarter.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("application")
@Component
public class AppProperties {
    private String helloMessage;
    private OtherProps other;

    public String getHelloMessage() {
        return helloMessage;
    }

    public void setHelloMessage(String helloMessage) {
        this.helloMessage = helloMessage;
    }

    public OtherProps getOther() {
        return other;
    }

    public void setOther(OtherProps other) {
        this.other = other;
    }

    public static class OtherProps {
        private String message;

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }
}
