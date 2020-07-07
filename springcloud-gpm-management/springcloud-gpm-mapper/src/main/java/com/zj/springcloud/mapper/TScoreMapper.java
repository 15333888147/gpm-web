package com.zj.springcloud.mapper;

import com.zj.springcloud.model.TScore;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TScoreMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TScore record);

    TScore selectByPrimaryKey(Long id);

    List<TScore> selectAll();

    int updateByPrimaryKey(TScore record);
}