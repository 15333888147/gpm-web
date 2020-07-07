package com.zj.springcloud.mapper;

import com.zj.springcloud.model.TDict;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TDictMapper {
    int deleteByPrimaryKey(Long dictId);

    int insert(TDict record);

    TDict selectByPrimaryKey(Long dictId);

    List<TDict> selectAll();

    int updateByPrimaryKey(TDict record);
}