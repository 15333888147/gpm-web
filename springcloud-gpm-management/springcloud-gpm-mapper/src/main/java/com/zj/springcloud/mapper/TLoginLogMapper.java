package com.zj.springcloud.mapper;

import com.zj.springcloud.model.TLoginLog;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TLoginLogMapper {
    int insert(TLoginLog record);

    List<TLoginLog> selectAll();
}