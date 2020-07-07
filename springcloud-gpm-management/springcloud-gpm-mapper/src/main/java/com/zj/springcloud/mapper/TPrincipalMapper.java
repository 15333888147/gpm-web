package com.zj.springcloud.mapper;

import com.zj.springcloud.model.TPrincipal;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TPrincipalMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TPrincipal record);

    TPrincipal selectByPrimaryKey(Long id);

    List<TPrincipal> selectAll();

    int updateByPrimaryKey(TPrincipal record);
}