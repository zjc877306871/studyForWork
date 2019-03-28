package com.late;/**
 * Created by user on 2019/3/28.
 */

import com.late.config.TomAppConfig;
import com.late.config.TomRootConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @ClassName TomWebAppInitializer
 * @Description //web容器启动的时候创建对象；调用方法来初始化容器以前前端控制器
 * @Autor user
 * @Date 2019/3/28 11:11
 * @Version 1.0
 **/
public class TomWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("getRootConfigClasses");
        return new Class<?>[]{TomRootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{TomAppConfig.class};
    }

    //获取DispatcherServlet的映射信息
    //  /：拦截所有请求（包括静态资源（xx.js,xx.png）），但是不包括*.jsp；
    //  /*：拦截所有请求；连*.jsp页面都拦截；jsp页面是tomcat的jsp引擎解析的；
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
