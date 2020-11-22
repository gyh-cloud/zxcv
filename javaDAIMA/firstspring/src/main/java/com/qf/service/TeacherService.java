package com.qf.service;

import com.qf.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.io.IOException;
import java.util.List;

public interface TeacherService {


    int insert(Teacher teacher);
    int update(Teacher teacher);
    int delete(@Param("id")Integer id);

    Teacher findById2(@Param("id") Integer id);

    List<Teacher> findAll(int page);
}
