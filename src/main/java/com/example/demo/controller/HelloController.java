package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1")
//@RequiredArgsConstructor
public class HelloController {

    @GetMapping("resource")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Here is your resource");
    }
}