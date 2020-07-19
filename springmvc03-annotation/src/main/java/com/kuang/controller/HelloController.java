package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author ：ltb
 * @date ：2020/7/19
 */
@Controller
@RequestMapping("/hellomvc")
public class HelloController {


    @RequestMapping("/hello")
    public String hello1(Model model){
        model.addAttribute("msg","Hello,SpringMVCAnnotation!");
        return "hello";
    }

    @RequestMapping("/hello1")
    public String hello2(Model model){
        model.addAttribute("msg","Hello,SpringMVCAnnotation!");
        return "hello";
    }

    @RequestMapping("/hello2")
    public String hello3(Model model){
        model.addAttribute("msg","Hello,SpringMVCAnnotation!");
        return "hello";
    }
}
