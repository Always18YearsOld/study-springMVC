package com.kuang.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author ：ltb
 * @date ：2020/7/19
 */
public class HelloController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView();


        //业务代码
        //我们这里没有业务代码，就假设返回了一个字符串
        String result = "HelloSpringMVC";

        mv.addObject("msg",result);

        //视图跳转
        mv.setViewName("test");


        return mv;
    }
}
