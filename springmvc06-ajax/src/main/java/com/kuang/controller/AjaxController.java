package com.kuang.controller;

import com.kuang.pojo.RegisterUser;
import com.kuang.pojo.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ：ltb
 * @date ：2020/7/22
 */
@RestController
public class AjaxController {

    @RequestMapping("/test")
    public String test() {
        return "hello";
    }


    @RequestMapping("/a1")
    public void a1(String name, HttpServletResponse response) throws IOException {
        System.out.println("a1:param=>" + name);
        if ("李白".equalsIgnoreCase(name)) {
            response.getWriter().println("true");
        } else {
            response.getWriter().println("false");
        }
    }

    @RequestMapping("/a2")
    public List<User> a2() {
        List<User> list = new ArrayList<>();
        list.add(new User("李白", 1, "nan"));
        list.add(new User("杜甫", 2, "nan"));
        list.add(new User("白居易", 3, "nan"));
        list.add(new User("李清照", 4, "nv"));

        return list;
    }

    @RequestMapping("/register")
    public boolean register(String username) {
        List<RegisterUser> list = new ArrayList<>();
        list.add(new RegisterUser("a", "a"));
        list.add(new RegisterUser("aa", "aa"));
        list.add(new RegisterUser("aaa", "aaa"));
        for (RegisterUser user : list) {
            if (username.equalsIgnoreCase(user.getUsername())) {
                return false;
            }
        }
        return true;
    }

    @RequestMapping("/login")
    public boolean login(String username,String password) {
        List<RegisterUser> list = new ArrayList<>();
        list.add(new RegisterUser("a", "a"));
        list.add(new RegisterUser("aa", "aa"));
        list.add(new RegisterUser("aaa", "aaa"));
        for (RegisterUser user : list) {
            if (username.equalsIgnoreCase(user.getUsername()) && password.equalsIgnoreCase(user.getPassword())) {
                return true;
            }
        }
        return false;
    }
}
