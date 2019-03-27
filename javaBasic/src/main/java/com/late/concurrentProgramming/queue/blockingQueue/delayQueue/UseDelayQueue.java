package com.late.concurrentProgramming.queue.blockingQueue.delayQueue;/**
 * Created by user on 2018/9/20.
 */


import com.late.concurrentProgramming.thread.TreadSleepUtil;

import java.util.concurrent.DelayQueue;

/**
 * @ClassName UseDelayQueue
 * @Description 支持延时获取的元素的阻塞队列，元素必须要实现Delayed接口。
 * 适用场景：实现自己的缓存系统，订单到期，限时支付等等。
 * @Autor user
 * @Date 2018/9/20 16:37
 * @Version 1.0
 **/
public class UseDelayQueue {

    public static void main(String[] args) {
        DelayQueue<PackOrder<Order>> delayQueue = new DelayQueue<>();
        new Thread(new PutOrder(delayQueue)).start();
        TreadSleepUtil.sleep(3);
        new Thread(new TakeOrder(delayQueue)).start();
    }
}
