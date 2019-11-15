package com.lhx.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("nativeConfig")
public class NativeConfigController {
    @Value("${server.port}")
    private String port;
    @Value("${foo}")
    private String foo;

    @GetMapping("/index")
    public String index(){
        return port+"---"+foo;
    }
}
