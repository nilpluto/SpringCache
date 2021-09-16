package com.example.SpringCache.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/health-check")
    public String getHealthCheck() {
        System.out.println(" Health Check Requested ");
        return "Health UP";
    }
}
