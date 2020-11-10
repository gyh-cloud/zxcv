package com.qf.controller;

import com.qf.pojo.User;
import com.qf.service.UserServices;
import com.qf.service.impl.UserServicesImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

@WebServlet("/user")
public class UserController extends BaseController {
    private UserServicesImpl userServices = new UserServicesImpl();
    protected String load(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //查询所有用户
        UserServicesImpl userServices = new UserServicesImpl();
        List<User> list= userServices.findAll();
        //将数据设置到req中
        req.setAttribute("user",list);
        //设置跳转的页面
        req.getRequestDispatcher("/userlist.jsp").forward(req,resp);
        return null;
    }
    protected String deleteById(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String ids = req.getParameter("id");
        Integer id = Integer.valueOf(ids);
        int res = userServices.deleteById(id);
        if (res==1){
            return this.load(req,resp);
        }
        return "";
    }
    protected String add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        try {
            username=new String(username.getBytes("iso-8859-1"),"utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String address = req.getParameter("address");
        try {
            address=new String(address.getBytes("iso-8859-1"),"utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String sex = req.getParameter("sex");
        try {
            sex=new String(sex.getBytes("iso-8859-1"),"utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String age = req.getParameter("age");
        User user = new User(null,username,address, sex);
        userServices.add(user);
        return this.load(req,resp);
    }

}
