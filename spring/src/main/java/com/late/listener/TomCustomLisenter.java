package com.late.listener;/**
 * Created by zjc on 2019/3/26.
 */

import com.late.event.TomCustomApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * 描述:
 * 自定义事件监听器
 *
 * @author zjc
 * @create 2019-03-26 23:06
 */

public class TomCustomLisenter implements ApplicationListener<TomCustomApplicationEvent> {
    @Override
    public void onApplicationEvent(TomCustomApplicationEvent tomCustomEvent) {
        System.out.println("自定义事件监听开始工作");
        System.out.println("自定义监听到的名字："+ tomCustomEvent.getName());
    }
}