package com.zj.springcloud.mapper;

import com.zj.springcloud.model.TAudit;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TAuditMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TAudit record);

    TAudit selectByPrimaryKey(Long id);

    List<TAudit> selectAll();

    int updateByPrimaryKey(TAudit record);
}