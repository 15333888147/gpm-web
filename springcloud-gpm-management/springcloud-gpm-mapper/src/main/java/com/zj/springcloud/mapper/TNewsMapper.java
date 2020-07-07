package com.zj.springcloud.mapper;

import com.zj.springcloud.model.TNews;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TNewsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TNews record);

    TNews selectByPrimaryKey(Long id);

    List<TNews> selectAll();

    int updateByPrimaryKey(TNews record);
}