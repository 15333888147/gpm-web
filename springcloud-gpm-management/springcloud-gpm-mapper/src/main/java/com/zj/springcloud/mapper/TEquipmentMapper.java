package com.zj.springcloud.mapper;

import com.zj.springcloud.model.TEquipment;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TEquipmentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TEquipment record);

    TEquipment selectByPrimaryKey(Long id);

    List<TEquipment> selectAll();

    int updateByPrimaryKey(TEquipment record);
}