package com.example.quotesbe.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;



@Configuration
@PropertySource("classpath:application.properties")
public class MyBean {


    @Value("${quote.env}")
    private String quoteEnv;

    public String getQuote() {
        return quoteEnv;
    }
}
