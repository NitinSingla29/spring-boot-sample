package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by NSingla on 24-02-2017.
 */
@RestController
public class HelloWorldConroller {

    @RequestMapping("/")
    public String index() {
        return "Welcome to sample web application based on spring web mvc";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "Hi! Welcome to sample web application based on spring web mvc";
    }
}
