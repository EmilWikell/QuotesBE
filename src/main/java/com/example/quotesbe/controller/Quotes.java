package com.example.quotesbe.controller;

import com.example.quotesbe.config.MyBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping( "/quotes")
public class Quotes {

    @Autowired
    ApplicationContext context;


    @GetMapping( "random")
    public String getRandomQuote(){
        MyBean bean = context.getBean(MyBean.class);
        return bean.getQuote() + ":)";
    }



}
