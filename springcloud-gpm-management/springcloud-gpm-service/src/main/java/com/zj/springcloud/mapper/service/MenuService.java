package com.zj.springcloud.mapper.service;

import com.zj.springcloud.mapper.MenuMapper;
import com.zj.springcloud.model.TMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: zj
 * @Date: 2020/7/7
 */
@Service
public class MenuService {

    @Autowired
    private MenuMapper menuMapper;

    public List<TMenu> selectFirstMenu(Long id){
        return menuMapper.selectFirstMenu(id);
    }
}
