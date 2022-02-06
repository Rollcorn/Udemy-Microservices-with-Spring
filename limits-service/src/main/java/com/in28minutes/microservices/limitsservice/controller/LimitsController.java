package com.in28minutes.microservices.limitsservice.limitsservice.controller;


import com.in28minutes.microservices.limitsservice.limitsservice.bean.Limits;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @GetMapping("/limits")
    public Limits retrieveLimits() {

    }


}
