package com.late.servlet;/**
 * Created by user on 2019/3/27.
 */

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName TomServlet
 * @Description 自定义Servlet
 * @Autor user
 * @Date 2019/3/27 13:41
 * @Version 1.0
 **/
@WebServlet("/order")
public class TomServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {

        System.out.println("TomServlet初始化 init");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("TomServlet初始化");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("success");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
