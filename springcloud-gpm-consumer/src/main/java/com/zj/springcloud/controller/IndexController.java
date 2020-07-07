package com.zj.springcloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: zj
 * @Date: 2020/7/7
 */

@Controller
public class IndexController {

    @GetMapping("/index")
    public String index(){
        return "index";
    }

}
