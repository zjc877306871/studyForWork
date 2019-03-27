package com.late.servlet;/**
 * Created by user on 2019/3/27.
 */


import javax.servlet.FilterRegistration;
import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/**
 * @ClassName TomServletContainerInitializer
 * @Description servlet初始化容器类,注册三大组件   com.late.servlet Filt Lisenter
 * @Autor user
 * @Date 2019/3/27 10:29
 * @Version 1.0
 **/
@HandlesTypes(TomService.class)
public class TomServletContainerInitializer implements ServletContainerInitializer {
    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {


        //添加 自定义过滤器
        FilterRegistration.Dynamic tomFliter = servletContext.addFilter("tomFliter", new TomFilter());
        System.out.println("添加过滤器完成");
        Collection<String> servletNameMappings = tomFliter.getServletNameMappings();
        Iterator<String> iterator = servletNameMappings.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println("servletNameMappings: " + next);

        }

        //添加自定义上下文监听器
        servletContext.addListener(TomLisenter.class);

        //添加自定义 com.late.servlet
        servletContext.addServlet("tomServlet",TomServlet.class);

    }
}
