package com.bruce.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "test", produces = {"application/json;charset=UTF-8"})
public class MainController {
    @RequestMapping(value = "/test")
    @ResponseBody
    public String test() {
        return "hello";
    }
}
