package com.demo.filter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetMsgController {
    @RequestMapping(value = "/getmsg")
    public String GetMsg(){
        return "okyanwneyi";
    }

}
