package com.ljp.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class FruitsController {
    @Value("${ljp.config.center.apple}")
    private String apples;


    @Value("${ljp.config.center.banana}")
    private String banana;

    @RequestMapping(value = "/getApple")
    public String getApple() {
        return apples;
    }

    @RequestMapping(value = "/getBanana")
    public String getBanana() {
        return banana;
    }
}
