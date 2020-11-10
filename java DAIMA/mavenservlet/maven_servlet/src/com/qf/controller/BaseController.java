package com.qf.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;


public class BaseController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //用户的增删查改
        String action=req.getParameter("action");
        if(action==null){
            //找不到方法自动执行load方法
            action="load";
        }
        try {
            //获得方法
            Method method= this.getClass().getDeclaredMethod(action, HttpServletRequest.class, HttpServletResponse.class);
            //调用方法
            Object obj= method.invoke(this,req,resp);
            if(obj!=null && obj instanceof String){
                String page=(String)obj;
                //判断是否异步
                if (page.startsWith("ajax")){
                    //异步返回
                    PrintWriter writer = resp.getWriter();
                    writer.write(page.substring(5));
                    writer.flush();
                    return;
                }else if (page.startsWith("redirect")){
                    //重定向到页面
                    resp.sendRedirect(page.substring(9)+".jsp");
                    return;
                }else if (page.startsWith("re")){
                    //重定向到控制器
                    resp.sendRedirect(page.substring(3));
                    return;
                }
                //请求转发
                req.getRequestDispatcher(page+".jsp").forward(req,resp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
