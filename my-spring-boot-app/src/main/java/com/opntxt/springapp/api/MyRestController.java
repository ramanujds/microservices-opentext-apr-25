package com.opntxt.springapp.api;

import com.opntxt.springapp.dto.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class MyRestController {

    @GetMapping
    public String hello() {
        return "Hello from Spring Boot";
    }

    @GetMapping("/message")
    public Message getMessage() {
        return new Message(1, "Good Morning", LocalDateTime.now());
    }



}
