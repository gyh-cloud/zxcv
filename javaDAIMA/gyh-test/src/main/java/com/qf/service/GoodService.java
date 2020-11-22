package com.qf.service;

import com.qf.pojo.Good;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface GoodService {
    List<Good> findAll();
    Good findById(@Param("id")Integer id);
    int deleteById(@Param("id")Integer id);
    int updateById(Good good);
    int insert(Good good, MultipartFile file);
}
