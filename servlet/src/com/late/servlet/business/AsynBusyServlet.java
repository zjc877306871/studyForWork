package com.late.servlet.business;/**
 * Created by user on 2019/3/28.
 */

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName AsynBusyServlet
 * @Description TODO
 * @Autor user
 * @Date 2019/3/28 16:20
 * @Version 1.0
 **/
@WebServlet(value = "/asyn",asyncSupported = true)
public class AsynBusyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("主线程开始进行工作，名字：" + Thread.currentThread().getName() +
            "时间：" + System.currentTimeMillis());
        //获取异步任务 上下文
        AsyncContext context = req.startAsync();
        context.start(new Runnable() {
            @Override
            public void run() {
                System.out.println("异步线程开始执行工作，名字：" + Thread.currentThread().getName() +
                    "时间：" +System.currentTimeMillis());
                try {
                    dealOrder();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                ServletResponse response = context.getResponse();
                try {
                    response.getWriter().write("deal order sucess ....");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                //让该异步结束。
                context.complete();
                System.out.println("异步线程结束，名字：" + Thread.currentThread().getName() +
                        "时间：" +System.currentTimeMillis());
            }
        });

        System.out.println("主线程结束工作，名字：" + Thread.currentThread().getName() +
                "时间：" +System.currentTimeMillis());
    }

    private void dealOrder() throws InterruptedException {
        System.out.println("模拟具体的业务处理，线程：" + Thread.currentThread().getName());
        Thread.sleep(3000);
    }
}
