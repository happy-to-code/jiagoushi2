package com.yida.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/")
public class MyTestController {

    @GetMapping("get")
    public String getTest() {
        return "test-demo";
    }
}
