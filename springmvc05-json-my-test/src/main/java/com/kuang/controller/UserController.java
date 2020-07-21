package com.kuang.controller;

import com.kuang.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author ：ltb
 * @date ：2020/7/20
 */
@Controller
public class UserController {

    @PostMapping(value = "/user/t1")
    public String userController(User user, Model model){
        System.out.println(user);
        model.addAttribute("msg",user);
        return "user";

    }
}
