package com.qf.util;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import java.util.Properties;

public class DBtools {
    private static DruidDataSource ds;
    static {
        Properties p= new Properties();
        try {
            p.load(DBtools.class.getClassLoader().getResourceAsStream("db.properties"));
            ds= (DruidDataSource) DruidDataSourceFactory.createDataSource(p);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static DruidDataSource getDataSource(){
        return ds;
    }
}
