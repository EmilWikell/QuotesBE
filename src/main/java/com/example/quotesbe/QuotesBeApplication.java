package com.example.quotesbe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

import java.beans.beancontext.BeanContext;

@SpringBootApplication
public class QuotesBeApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuotesBeApplication.class, args);
    }
}
