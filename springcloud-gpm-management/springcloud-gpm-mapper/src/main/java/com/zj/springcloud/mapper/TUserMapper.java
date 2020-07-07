package com.zj.springcloud.mapper;

import com.zj.springcloud.model.TUser;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TUser record);

    TUser selectByPrimaryKey(Long id);

    List<TUser> selectAll();

    int updateByPrimaryKey(TUser record);
}