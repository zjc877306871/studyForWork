package com.late.service;/**
 * Created by user on 2019/4/3.
 */

import com.late.interfaceApi.OrderService;

/**
 * @ClassName OrderServiceImpl
 * @Description 订单的服务
 * @Autor user
 * @Date 2019/4/3 19:36
 * @Version 1.0
 **/
//@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public String queryOrder(String id) {
        System.out.println("服务端接收参数id:" + id);
        String result;
        if("1".equals(id)){
            result = "good";
        }else{
            result = "wrong";
        }
        return result;
    }
}
