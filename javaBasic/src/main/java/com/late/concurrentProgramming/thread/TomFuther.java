package com.late.concurrentProgramming.thread;/**
 * Created by user on 2019/3/26.
 */

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @ClassName TomFuther
 * @Description TODO
 * @Autor user
 * @Date 2019/3/26 16:08
 * @Version 1.0
 **/
public class TomFuther {

    private static class RandomThread implements Callable<Integer>{

        @Override
        public Integer call() throws Exception {
            System.out.println("异步线程任务开始计算");
            Random random = new Random();
            int  i = random.nextInt();
            TreadSleepUtil.sleep(3);
            return i;
        }
    }


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Integer> future = new FutureTask(new RandomThread());
        new Thread(future).start();
        System.out.println("线程任务开始，等待返回结果 "+"当前时间:" + System.currentTimeMillis());
        Integer integer = future.get();
        System.out.println("返回结果：" + integer +"当前时间:" + System.currentTimeMillis());
    }

}
