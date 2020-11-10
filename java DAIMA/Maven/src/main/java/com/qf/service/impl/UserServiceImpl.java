package com.qf.service.impl;

import com.qf.dao.impl.UserDaoImpl;
import com.qf.pojo.User;
import com.qf.service.UserService;

import java.util.List;

/**
 * Created by 54110 on 2020/11/9.
 */
public class UserServiceImpl implements UserService {
    private UserDaoImpl userDao = new UserDaoImpl();
    @Override
    public List<User> findAll() {
        //去dao层调用方法 进行查找

        return userDao.findAll();
    }

    @Override
    public User findById(Integer id) {
        return userDao.findById(id);
    }

    public Boolean update(User user) {
        return userDao.update(user);
    }
}
