package com.zj.springcloud.mapper;

import com.zj.springcloud.model.TCheckPerson;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TCheckPersonMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TCheckPerson record);

    TCheckPerson selectByPrimaryKey(Long id);

    List<TCheckPerson> selectAll();

    int updateByPrimaryKey(TCheckPerson record);
}