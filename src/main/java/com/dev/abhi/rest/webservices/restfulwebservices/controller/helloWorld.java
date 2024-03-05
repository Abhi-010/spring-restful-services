package com.dev.abhi.rest.webservices.restfulwebservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorld {

    @RequestMapping(method = RequestMethod.GET,path="/hello-world")
    public String helloWorld(){
        return "hello world";
    }
}
