package com.example.serviceb.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "servicea")
public interface ServiceAClient {
    @GetMapping("/a/hello")
    String helloWorld();
}
