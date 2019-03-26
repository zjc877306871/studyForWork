package com.late.event;/**
 * Created by zjc on 2019/3/26.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 描述:
 * 用于封装发布事件
 *
 * @author zjc
 * @create 2019-03-26 23:38
 */
@Component
public class PublishEvent {
    @Autowired
    private ApplicationContext context;

    public void publishName(String name){
        TomCustomApplicationEvent event = new TomCustomApplicationEvent(context,name);
        context.publishEvent(event);
    }

}