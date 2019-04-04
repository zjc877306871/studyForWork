package com.late.controller;/**
 * Created by user on 2019/4/3.
 */

import com.alibaba.dubbo.config.annotation.Reference;
import com.late.interfaceApi.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName OrderController
 * @Description 订单跳转入口
 * @Autor user
 * @Date 2019/4/3 18:28
 * @Version 1.0
 **/

@Controller
public class OrderController {

    @Reference
    private OrderService service;

    /**
     * 查询订单
     * @return
     */
    @RequestMapping("/queryOrder")
    public String queryOrder(){
        System.out.println(">>>>>>>>>>>>queryOrder开始任务>>>>>>>>>>>>>>>>>");
        String id = "1";
        String result = service.queryOrder(id);
        System.out.println("结果是： " + result);
        return "order";
    }
}
