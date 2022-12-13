package com.example.quotesbe.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/quotes")
public class Quotes {

    private final List<String> quotesList = new ArrayList<>();

    @GetMapping("/random")
    public String getRandomQuote(){
        quotesList.add("Du är fin");

        return quotesList.get(0);
    }



}
