package com.zj.springcloud.mapper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: zj
 * @Date: 2020/7/7
 */
@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(){
        return "login";
    }

}
