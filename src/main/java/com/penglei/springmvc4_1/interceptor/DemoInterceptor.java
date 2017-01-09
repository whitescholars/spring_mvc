package com.penglei.springmvc4_1.interceptor;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by pl on 2017/1/9.
 */
public class DemoInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        long starttime= System.currentTimeMillis();
        httpServletRequest.setAttribute("starttime",starttime);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        long starttime= (long) httpServletRequest.getAttribute("starttime");
        long endtime= System.currentTimeMillis();
        System.out.println("本次处理时间:"+new Long(endtime-starttime)+"ms");
        httpServletRequest.setAttribute("handletime",endtime-starttime);
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }

}
