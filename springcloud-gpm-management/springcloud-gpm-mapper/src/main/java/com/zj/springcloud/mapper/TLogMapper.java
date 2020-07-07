package com.zj.springcloud.mapper;

import com.zj.springcloud.model.TLog;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TLog record);

    List<TLog> selectAll();

    int updateByPrimaryKey(TLog record);
}