package com.late.servlet.business;/**
 * Created by zjc on 2019/3/27.
 */

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 描述:
 * 业务请求处理器
 *
 * @author zjc
 * @create 2019-03-27 22:55
 */

public class BusyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("busyServet开始工作");
        resp.getWriter().write("success");

    }
}