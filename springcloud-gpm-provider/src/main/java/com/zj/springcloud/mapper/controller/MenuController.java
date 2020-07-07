package com.zj.springcloud.mapper.controller;

import com.zj.springcloud.mapper.service.MenuService;
import com.zj.springcloud.model.TMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: zj
 * @Date: 2020/7/7
 */
@RestController
public class MenuController {
    @Autowired
    MenuService menuService;

    @GetMapping("/firstMenu")
    public List<TMenu> firstMenu(Long id){
       return menuService.selectFirstMenu(id);
    }

}
