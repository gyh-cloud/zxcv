package com.qf.service.impl;

import com.github.pagehelper.PageHelper;
import com.qf.dao.TeacherMapper;
import com.qf.pojo.Teacher;
import com.qf.service.TeacherService;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TeacherSerivceimpl implements TeacherService {


    @Override
    public List<Teacher> findAll(int page)  {
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        PageHelper.startPage(page,2);
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> all = mapper.findAll();
        return all;
    }

    @Override
    public int insert(Teacher teacher) {
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        int i = mapper.insert(teacher);
        return i;
    }

    @Override
    public int update(Teacher teacher) {
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        int i = mapper.update(teacher);
        return i;
    }

    @Override
    public int delete(Integer id) {
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        int i = mapper.delete(id);
        return i;
    }

    @Override
    public Teacher findById2(Integer id) {
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.findById2(id);
        return teacher;
    }


}
