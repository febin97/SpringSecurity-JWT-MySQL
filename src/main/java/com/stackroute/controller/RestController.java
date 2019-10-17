package com.stackroute.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @RequestMapping({ "/hello" })
    public String firstPage() {
        return "Hello World";
    }
}
