package com.late.event;/**
 * Created by zjc on 2019/3/26.
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.ApplicationContextEvent;

/**
 * 描述:
 * 自定义事件----事件需要通过ApplicationContext接口发布出去
 *
 * @author zjc
 * @create 2019-03-26 23:04
 */

public class TomCustomApplicationEvent extends ApplicationEvent{

    private String name;

    public TomCustomApplicationEvent(ApplicationContext source,String name) {
        super(source);
        this.name = name;
        System.out.println("创建一个自定义监听事件--TomCustomApplicationEvent");
    }

    public String getName() {
        return name;
    }
}