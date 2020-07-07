package com.zj.springcloud.mapper;

import com.zj.springcloud.model.TMappingProject;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TMappingProjectMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TMappingProject record);

    TMappingProject selectByPrimaryKey(Long id);

    List<TMappingProject> selectAll();

    int updateByPrimaryKey(TMappingProject record);
}