package com.zj.springcloud.mapper.controller;

import com.zj.springcloud.mapper.service.SpringcloudGpmService;
import com.zj.springcloud.model.TMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public String index(Model model){
        List<TMenu> firstMenu = this.firstMenu(1L);
        model.addAttribute("firstMenu",firstMenu);
        return "index";
    }

    @GetMapping("/firstMenu")
    @ResponseBody
    public List<TMenu> firstMenu(Long id){
        return springcloudGpmService.firstMenu(id);
    }

    @GetMapping("/secondMenu")
    @ResponseBody
    public List<TMenu> secondMenu(Long menuId){
        return springcloudGpmService.secondMenu(menuId);
    }

}
