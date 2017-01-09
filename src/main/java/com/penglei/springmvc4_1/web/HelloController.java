package com.penglei.springmvc4_1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by pl on 2017/1/9.
 */
@Controller
public class HelloController {

    @RequestMapping("/index")
    public String hello(){
        return "index";
    }
}
