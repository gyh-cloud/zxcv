package com.qf.dao;

import com.qf.pojo.Good;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodMapper {
    List<Good> findAll();
    Good findById(@Param("id")Integer id);
    int deleteById(@Param("id")Integer id);
    int updateById(Good good);
    int insert(Good good);
}
