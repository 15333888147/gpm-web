package com.zj.springcloud.mapper;

import com.zj.springcloud.model.TResultCommit;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TResultCommitMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TResultCommit record);

    TResultCommit selectByPrimaryKey(Long id);

    List<TResultCommit> selectAll();

    int updateByPrimaryKey(TResultCommit record);
}