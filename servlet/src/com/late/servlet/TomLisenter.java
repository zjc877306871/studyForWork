package com.late.servlet;/**
 * Created by user on 2019/3/27.
 */

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @ClassName TomLisenter
 * @Description servlet上下文监听器
 * @Autor user
 * @Date 2019/3/27 13:25
 * @Version 1.0
 **/
public class TomLisenter implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("TomLisenter 初始化");
        ServletContext servletContext = servletContextEvent.getServletContext();
        String contextPath = servletContext.getContextPath();

    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("TomLisenter 销毁");
    }
}
