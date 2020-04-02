package com.akun.docker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDockerController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello akun";
    }
}
