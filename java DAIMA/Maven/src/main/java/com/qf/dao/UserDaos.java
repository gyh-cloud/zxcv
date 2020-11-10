package com.qf.dao;

import com.qf.pojo.User;

import java.util.List;

public interface UserDaos {
    public List<User> findAll();

    int deleteById(Integer id);

    User add(User user);
}
