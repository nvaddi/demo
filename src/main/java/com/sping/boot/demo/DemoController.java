package com.sping.boot.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("/msg")
    public String message(){
        return "My Name is Niranjan";
    }
}
