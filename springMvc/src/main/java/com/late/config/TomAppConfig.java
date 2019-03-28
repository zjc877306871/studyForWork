package com.late.config;/**
 * Created by user on 2019/3/28.
 */

import com.late.Interceptor.TomInterceptor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.*;

/**
 * @ClassName TomAppConfig
 * @Description //SpringMVC只扫描Controller；子容器
                 //useDefaultFilters=false 禁用默认的过滤规则；
 * @Autor user
 * @Date 2019/3/28 13:13
 * @Version 1.0
 **/
@ComponentScan(value = "com.late", includeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class})
},useDefaultFilters = false)

@EnableWebMvc
//@EnableWebMvc是使用Java 注解快捷配置Spring Webmvc的一个注解。
// 在使用该注解后配置一个继承于WebMvcConfigurerAdapter的配置类即可配置好Spring Webmvc。
public class TomAppConfig extends WebMvcConfigurerAdapter{

    //添加自定义拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new TomInterceptor()).addPathPatterns("/**");
    }

    //视图解析器
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        System.out.println("configureViewResolvers");
        registry.jsp("/WEB-INF/pages/",".jsp");
    }
    //静态资源访问,静态资源交给tomcat来处理
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
