package com.zj.springcloud.mapper;

import com.zj.springcloud.model.TResource;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TResourceMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TResource record);

    TResource selectByPrimaryKey(Long id);

    List<TResource> selectAll();

    int updateByPrimaryKey(TResource record);
}