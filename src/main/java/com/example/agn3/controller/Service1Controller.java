package com.example.agn3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class

Service1Controller
{
    @GetMapping("/api/service1")
    public String service1Endpoint() {
        return "Hello from Service-1";
    }
}
