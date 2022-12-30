package com.yida.controller;

import com.yida.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("/test/")
public class MyTestController {
    @Autowired
    private TestService testService;

    @Value("${server.port}")
    private Integer port;

    @Value("${abc.d}")
    private String d;

    @GetMapping("get")
    public String getTest() {
        System.out.println("port = " + port);
        System.out.println("d =---------> " + d);
        return testService.testGet("", 1);
    }

    @GetMapping("syncT")
    public String syncTest() {
        try {
            return testService.testSyncT();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (TimeoutException e) {
            throw new RuntimeException(e);
        }
    }
    @GetMapping("syncT2")
    public String syncTest2() {
        try {
            return testService.testSyncT2();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (TimeoutException e) {
            throw new RuntimeException(e);
        }
    }
}
