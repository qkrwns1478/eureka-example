package com.example.serviceb.controller;

import com.example.serviceb.client.ServiceAClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceBRestController {

    private final ServiceAClient serviceAClient;

    public ServiceBRestController(ServiceAClient serviceAClient) {
        this.serviceAClient = serviceAClient;
    }

    @GetMapping("helloEureka")
    public String helloWorld() {
        return "[SERVICEB] " + serviceAClient.helloWorld();
    }
}
