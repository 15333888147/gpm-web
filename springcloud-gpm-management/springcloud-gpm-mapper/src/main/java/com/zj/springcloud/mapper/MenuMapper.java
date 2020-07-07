package com.zj.springcloud.mapper;

import com.zj.springcloud.model.TMenu;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: zj
 * @Date: 2020/7/7
 */
@Repository
public interface MenuMapper {

    /**
     * 一级菜单
     * @param id
     * @return
     */
    List<TMenu> selectFirstMenu(Long id);

}
