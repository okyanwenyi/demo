package com.demo.interceptor.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReuqestController {

    @RequestMapping(value = "/getmsg")
    public String GetMessage(){
        return "okyanwenyi";
    }

}
