package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author ：ltb
 * @date ：2020/7/20
 */
@Controller
public class EncodingController {



    @PostMapping("/encoding/t1")
    public String encoding(String name, Model model){
        System.out.println(name);
        model.addAttribute("msg", name);
        return "encodingTest";
    }

}
