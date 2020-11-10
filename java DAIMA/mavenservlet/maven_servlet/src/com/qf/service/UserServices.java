package com.qf.service;

import com.qf.pojo.User;

import java.util.List;

public interface UserServices {
    public List<User> findAll();

    int deleteById(Integer id);

    User add(User user);
}
