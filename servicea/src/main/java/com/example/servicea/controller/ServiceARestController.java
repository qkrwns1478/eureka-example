package com.example.servicea.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope // /actuator/refresh 엔드포인트를 호출하여 설정 변경 사항을 동적으로 반영 가능함
@RestController
@RequestMapping("/a")
public class ServiceARestController {

    @Value("${server.port}")
    private String serverPort;

    @Value("${message}")
    private String message;

	@GetMapping("/hello")
	public String helloWorld() {
		return message + " from Service A " + "Port " + serverPort;
	}

}
