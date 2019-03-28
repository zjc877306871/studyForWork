package com.late.controller;/**
 * Created by user on 2019/3/28.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName TomOrderController
 * @Description TODO
 * @Autor user
 * @Date 2019/3/28 16:10
 * @Version 1.0
 **/
@Controller
public class TomOrderController {

    /**
     * 跳转订单页面
     * @return
     */
    @RequestMapping("/toOrder")
    public String getOrderPage(HttpServletRequest request, HttpServletResponse response ) throws IOException {
        System.out.println("toOrder");
        return "order";
    }

}
