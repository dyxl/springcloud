package com.springcloud.hystrixdashboard.fallback;

import com.springcloud.hystrixdashboard.remote.HelloRemote;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class HelloRemoteFallBack implements HelloRemote {
    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello " + name + ", i am fallback massage";
    }
}