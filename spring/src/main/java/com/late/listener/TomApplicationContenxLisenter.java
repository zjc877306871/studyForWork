package com.late.listener;/**
 * Created by user on 2019/3/26.
 */

import com.late.chap1.Person;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ApplicationContextEvent;

/**
 * @ClassName TomApplicationContenxLisenter
 * @Description  研究自定义实现ApplicationListener监听不同的事件
 * @Autor user
 * @Date 2019/3/26 14:55
 * @Version 1.0
 **/
public class TomApplicationContenxLisenter implements ApplicationListener<ApplicationContextEvent> {
    /**
     * ApplicationContextEvent 事件在容器启动到关闭过程中会触发事件监听。他有四个子类
     * 分别是 上下文启动事件、上下文刷新事件、上下文停止事件、上下文关闭事件
     * @param event
     */
    @Override
    public void onApplicationEvent(ApplicationContextEvent event) {
        Person person = (Person)event.getApplicationContext().getBean("person");
        System.out.println("监听事件获取person的名字："+ person.getName());
    }
}
