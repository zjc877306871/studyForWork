package com.late.concurrentProgramming.queue.blockingQueue;


import com.late.concurrentProgramming.queue.blockingQueue.entry.People;
import com.late.concurrentProgramming.thread.TreadSleepUtil;

import java.util.concurrent.PriorityBlockingQueue;

/**
 * 一个支持优先级排序的无界阻塞队列。
 * 默认情况下，按照自然顺序，要么实现compareTo()方法，指定构造参数Comparator
 * Created by user on 2018/9/20.
 */
public class UsePriorityBlockingQueue {
    public static void main(String[] args) {
        PriorityBlockingQueue<People> priorityBlockingQueue = new PriorityBlockingQueue<>();

        String monthName1 = "put";
        String monthName2 = "take";
        ProductThread productThread = new ProductThread(priorityBlockingQueue,monthName1);
        ConsumerThread consumerThread = new ConsumerThread(priorityBlockingQueue,monthName2);

        for(int i = 0; i < 3; i++){
            new Thread(productThread).start();
        }

        TreadSleepUtil.sleep(1);
        for(int i = 0; i < 5; i++){
            new Thread(consumerThread).start();
        }
    }


}
