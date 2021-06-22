package com.swar.microservice.limitservice.controller;

import com.swar.microservice.limitservice.bean.Limits;
import com.swar.microservice.limitservice.configuartion.Configuartion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private Configuartion configuartion;

    @GetMapping("/limits")
    public Limits retriveLimits() {
        return new Limits(configuartion.getMinimum(), configuartion.getMaximum());
    }
}
