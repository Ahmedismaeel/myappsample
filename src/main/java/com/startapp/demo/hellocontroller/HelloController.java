package com.startapp.demo.hellocontroller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HelloController{


    @RequestMapping(value="/hello", method=RequestMethod.GET)
    public String requestMethodName() {
        return "Hello there";
    }
    

}