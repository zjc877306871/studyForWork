package com.late.Interceptor;/**
 * Created by user on 2019/3/28.
 */

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName TomInterceptor
 * @Description TODO
 * @Autor user
 * @Date 2019/3/28 14:35
 * @Version 1.0
 **/
public class TomInterceptor implements HandlerInterceptor {
    //目标方法前执行
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("TomInterceptor的preHandle()");
        return true;
    }
    //目标方法后执行
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
        System.out.println("TomInterceptor的postHandle()");
    }
    //页面响应后执行
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
        System.out.println("TomInterceptor的afterCompletion()");
    }
}
