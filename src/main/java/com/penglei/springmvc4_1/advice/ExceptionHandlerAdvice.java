package com.penglei.springmvc4_1.advice;

import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by pl on 2017/1/9.
 */
@ControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler(value = Exception.class)
    public ModelAndView exception(Exception exception,WebRequest webRequest){
        ModelAndView modelAndView=new ModelAndView("error");
        modelAndView.addObject("errorMsg",exception.getMessage());
        return modelAndView;
    }

    @ModelAttribute
    public void addAttribute(Model model){
        model.addAttribute("msg","额外消息");
    }

    @InitBinder
    public void initBind(WebDataBinder webDataBinder){
        webDataBinder.setDisallowedFields("id");
    }
}
