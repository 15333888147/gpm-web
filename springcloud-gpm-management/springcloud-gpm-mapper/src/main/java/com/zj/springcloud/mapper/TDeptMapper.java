package com.zj.springcloud.mapper;

import com.zj.springcloud.model.TDept;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TDeptMapper {
    int deleteByPrimaryKey(Long deptId);

    int insert(TDept record);

    TDept selectByPrimaryKey(Long deptId);

    List<TDept> selectAll();

    int updateByPrimaryKey(TDept record);
}