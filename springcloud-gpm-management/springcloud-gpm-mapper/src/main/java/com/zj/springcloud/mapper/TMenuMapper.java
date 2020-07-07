package com.zj.springcloud.mapper;

import com.zj.springcloud.model.TMenu;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TMenuMapper {
    int deleteByPrimaryKey(Long menuId);

    int insert(TMenu record);

    TMenu selectByPrimaryKey(Long menuId);

    List<TMenu> selectAll();

    int updateByPrimaryKey(TMenu record);
}