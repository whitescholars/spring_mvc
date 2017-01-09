package com.penglei.springmvc4_1.web;

import com.penglei.springmvc4_1.domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by pl on 2017/1/9.
 */
@Controller
public class AdviceController {
    @RequestMapping("/advice")
    public String getSomething(@ModelAttribute("msg") String msg,DemoObj demoObj){
        throw new IllegalArgumentException("参数有误，来自@ModelAttribute"+msg);
    }
}
