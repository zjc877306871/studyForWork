package com.late.servlet;/**
 * Created by user on 2019/3/27.
 */


import com.late.servlet.business.BusyServlet;
import com.late.servlet.service.TomService;

import javax.servlet.*;
import javax.servlet.annotation.HandlesTypes;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @ClassName TomServletContainerInitializer
 * @Description servlet初始化容器类,注册三大组件   com.late.servlet Filt Lisenter
 * @Autor user
 * @Date 2019/3/27 10:29
 * @Version 1.0
 **/
//容器启动的时候会将@HandlesTypes指定的这个类型下面的子类（实现类，子接口等）传递过来；
//传入感兴趣的类型；
@HandlesTypes(TomService.class)
public class TomServletContainerInitializer implements ServletContainerInitializer {
    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {

        //未解HandlesTypes注解内的值，在这娶不到
        for (Class clazz : set){
            System.out.println("感兴趣的类");
            System.out.println(clazz);
        }

        /**
         * 应用启动的时候，会运行onStartup方法；
         *
         * Set<Class<?>> arg0：感兴趣的类型的所有子类型；
         * ServletContext arg1:代表当前Web应用的ServletContext；一个Web应用一个ServletContext；
         *
         * 1）、使用ServletContext注册Web组件（Servlet、Filter、Listener）
         * 2）、使用编码的方式，在项目启动的时候给ServletContext里面添加组件；
         * 		必须在项目启动的时候来添加；
         * 		1）、ServletContainerInitializer得到的ServletContext；
         * 		2）、ServletContextListener得到的ServletContext；
         */


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
        ServletRegistration.Dynamic busyServlet = servletContext.addServlet("busyServlet", BusyServlet.class);
        busyServlet.addMapping("/busy");
        //将过滤器和请求链接相关联
        tomFliter.addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST),true,"/*");

    }
}
