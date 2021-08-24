package com.ljp.serverfeign.web;

import com.ljp.serverfeign.service.HelloSchedualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private HelloSchedualService helloSchedualService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHi(@RequestParam String name) {
        return helloSchedualService.sayHelloFromClientOne(name);
    }

    @Value("${ljp.config.center.apple}")
    String apple;

    @RequestMapping(value = "/getApple1", method = RequestMethod.GET)
    public String sayFoo() {
        return this.apple;
    }
}
