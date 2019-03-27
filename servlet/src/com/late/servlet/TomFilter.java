package com.late.servlet;/**
 * Created by user on 2019/3/27.
 */


import javax.servlet.*;
import java.io.IOException;

/**
 * @ClassName TomFilter
 * @Description 自定义过滤器
 * @Autor user
 * @Date 2019/3/27 10:59
 * @Version 1.0
 **/
public class TomFilter implements javax.servlet.Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("TomFilter初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("TomFilter执行业务doFilter");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("TomFilter结束destroy");
    }
}
