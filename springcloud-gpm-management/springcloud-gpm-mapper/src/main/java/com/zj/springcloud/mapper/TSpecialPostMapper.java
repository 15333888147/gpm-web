package com.zj.springcloud.mapper;

import com.zj.springcloud.model.TSpecialPost;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TSpecialPostMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TSpecialPost record);

    TSpecialPost selectByPrimaryKey(Long id);

    List<TSpecialPost> selectAll();

    int updateByPrimaryKey(TSpecialPost record);
}