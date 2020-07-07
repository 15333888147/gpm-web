package com.zj.springcloud.mapper;

import com.zj.springcloud.model.TMappingUnit;

import java.util.List;

public interface TMappingUnitMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TMappingUnit record);


    List<TMappingUnit> selectAll();

    int updateByPrimaryKey(TMappingUnit record);
}