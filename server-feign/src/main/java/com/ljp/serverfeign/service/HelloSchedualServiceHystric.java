package com.ljp.serverfeign.service;
import org.springframework.stereotype.Service;

@Service
public class HelloSchedualServiceHystric implements HelloSchedualService {
    @Override
    public String sayHelloFromClientOne(String name) {
        return "hello: "+name;
    }
}
