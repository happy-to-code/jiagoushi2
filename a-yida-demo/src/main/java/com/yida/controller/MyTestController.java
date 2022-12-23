package com.yida.controller;

import com.yida.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("/test/")
public class MyTestController {
    @Autowired
    private TestService testService;

    @GetMapping("get")
    public String getTest(@RequestParam(required = false, defaultValue = "") String sync) {
        if (sync.length() > 0) {
            System.out.println("sync =------------------------- ");
        }
        return testService.testGet("", 1);
    }
}
