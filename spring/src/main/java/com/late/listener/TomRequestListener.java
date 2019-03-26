package com.late.listener;/**
 * Created by zjc on 2019/3/26.
 */

import org.springframework.context.ApplicationListener;
import org.springframework.web.context.support.RequestHandledEvent;

/**
 * 描述:
 * 请求事件监听
 *
 * @author zjc
 * @create 2019-03-26 22:50
 */

public class TomRequestListener implements ApplicationListener<RequestHandledEvent>{

    @Override
    public void onApplicationEvent(RequestHandledEvent requestHandledEvent) {
        System.out.println("请求时间监听开始工作");
        String userName = requestHandledEvent.getUserName();
        long processingTimeMillis = requestHandledEvent.getProcessingTimeMillis();
        System.out.println("name is "+ userName + "time is" + processingTimeMillis);
    }
}