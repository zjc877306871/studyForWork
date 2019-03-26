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
     * ApplicationContextEvent 事件在容器启动成功后会触发时间监听
     * @param event
     */
    @Override
    public void onApplicationEvent(ApplicationContextEvent event) {
        Person person = (Person)event.getApplicationContext().getBean("person");
        System.out.println("获取person的名字："+ person.getName());
    }
}
