package com.zj.springcloud.mapper.controller;

import com.zj.springcloud.mapper.service.SpringcloudGpmService;
import com.zj.springcloud.model.TMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: zj
 * @Date: 2020/7/7
 */

@Controller
public class IndexController {

    @Autowired
    SpringcloudGpmService springcloudGpmService;

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/firstMenu")
    @ResponseBody
    public List<TMenu> firstMenu(Long id){
        return springcloudGpmService.firstMenu(id);
    }

}
