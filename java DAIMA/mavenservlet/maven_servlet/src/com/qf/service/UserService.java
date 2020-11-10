package com.qf.service;

import com.qf.pojo.User;
import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.List;

/**
 * Created by 54110 on 2020/11/9.
 */
public interface UserService {

    List<User> findAll();
    User findById(Integer id);
    public Boolean update(User user);
}
