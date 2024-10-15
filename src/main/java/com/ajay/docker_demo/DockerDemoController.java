package com.ajay.docker_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerDemoController {

    @GetMapping("/demo")
    public String getDemo(){
        return "SpringBoot application is dockerized";
    }
}
