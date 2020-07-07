package com.zj.springcloud.mapper;

import com.zj.springcloud.model.TRole;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TRoleMapper {
    int deleteByPrimaryKey(Long roleId);

    int insert(TRole record);

    TRole selectByPrimaryKey(Long roleId);

    List<TRole> selectAll();

    int updateByPrimaryKey(TRole record);
}