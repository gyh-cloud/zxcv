package com.qf.dao.impl;

import com.qf.dao.UserDaos;
import com.qf.pojo.User;
import com.qf.util.DBtools;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class UserDaosImpl implements UserDaos {
    private QueryRunner qr=new QueryRunner(DBtools.getDataSource());

    @Override
    public List<User> findAll() {
        try {
            StringBuffer sql=new StringBuffer("select * from user where 1=1");
            return  qr.query(sql.toString(),new BeanListHandler<User>(User.class));
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int deleteById(Integer id) {
        String sql="delete from user where id =?";
        try {
            return qr.update(sql,id);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public User add(User user) {
        String sql="insert into user values (?,?,12,?,?)";
        try {
            return qr.insert(sql,new BeanHandler<>(User.class),user.getId(),user.getAddress(),user.getSex(),user.getUsername());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null ;
    }

}
