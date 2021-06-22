package com.swar.restfulwebservice.helloworld;

import java.util.Locale;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldService {

    @GetMapping(path = "/hello")
    public String HelloWorld() {
        return "Hello World";
    }

    @GetMapping(path = "/hello-inter")
    public String HelloWorldInternationalized(
            @RequestHeader(name = "Accept-Language", required = false) Locale locale) {
        return "Hello World";
    }

    @GetMapping(path = "hello-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World!!");
    }
}