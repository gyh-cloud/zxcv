package com.qf.service.impl;

import com.qf.dao.UserDaos;
import com.qf.dao.impl.UserDaosImpl;
import com.qf.pojo.User;
import com.qf.service.UserServices;

import java.util.List;

public class UserServicesImpl implements UserServices {
    private UserDaos userDaos=new UserDaosImpl();
    public List<User> findAll() {
        return userDaos.findAll();
    }

    @Override
    public int deleteById(Integer id) {
        return userDaos.deleteById(id);
    }

    @Override
    public User add(User user) {
        return userDaos.add(user);
    }
}
