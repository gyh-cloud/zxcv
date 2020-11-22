package com.qf.service.impl;

import com.qf.dao.GoodMapper;
import com.qf.pojo.Good;
import com.qf.service.GoodService;
import com.qf.utils.UploadUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
@Service
public class GoodServiceImpl implements GoodService {
    @Autowired
    GoodMapper goodMapper;
    public List<Good> findAll() {
        return goodMapper.findAll();
    }

    public Good findById(Integer id) {
        return goodMapper.findById(id);
    }

    public int deleteById(Integer id) {
        return goodMapper.deleteById(id);
    }

    public int updateById(Good good) {
        return goodMapper.updateById(good);
    }

    public int insert(Good good, MultipartFile file) {
        UploadUtils uploadUtils = new UploadUtils();
        String pic="";
        try {
            pic=uploadUtils.upload(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        good.setGpic(pic);
        return goodMapper.insert(good);
    }
}
