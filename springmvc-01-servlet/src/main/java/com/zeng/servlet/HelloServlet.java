package com.zeng.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //1,获取前端参数
//        String method =req.getParameter("method");
//        if(method.equals("add")){
//            req.getSession().setAttribute("msg","执行了add方法");
//        }
//        if(method.equals("delete")){
//            req.getSession().setAttribute("msg","执行了delete方法");
//        }
        req.setAttribute("msg","控制法国德国德国" );
        //2，调用业务层
        //3，视图转发或者重定向
        req.getRequestDispatcher("test.jsp").forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       doGet(req, resp);
    }
}
