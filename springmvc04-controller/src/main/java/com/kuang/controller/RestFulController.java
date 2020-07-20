package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author ：ltb
 * @date ：2020/7/19
 */
//@RestController
//@RequestMapping("/test")
@Controller
public class RestFulController {

    //原来的风格
    //url:http://localhost:8080/t1?a=1&b=2
    @RequestMapping("/t1")
    public String add1(@RequestParam Integer a, @RequestParam Integer b, Model model) {
        Integer result = a + b;
        model.addAttribute("result", a + "+" + b + "=" + result);
        return "add";
    }

    //RestFul
    //url:http://localhost:8080/t2/1/2
    @RequestMapping("/t2/{a}/{b}")
    public String add2(@PathVariable(value = "a") Integer a, @PathVariable(value = "b") Integer b, Model model) {
        Integer result = a + b;
        model.addAttribute("result", a + "+" + b + "=" + result);
        return "add";
    }
}
