package com.kuang.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ：ltb
 * @date ：2020/7/22
 */
@RestController
public class AjaxController {

    @RequestMapping("/test")
    public String test(){
        return "hello";
    }


    @RequestMapping("/a1")
    public void a1(String name, HttpServletResponse response) throws IOException {
        System.out.println("a1:param=>"+name);
        if ("kuangshen".equalsIgnoreCase(name)){
            response.getWriter().println("true");
        }else{
            response.getWriter().println("false");
        }
    }
}
