package com.zj.springcloud.mapper;

import com.zj.springcloud.model.TTechnicist;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TTechnicistMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TTechnicist record);

    TTechnicist selectByPrimaryKey(Long id);

    List<TTechnicist> selectAll();

    int updateByPrimaryKey(TTechnicist record);
}