package com.zhangjc.javaBasic.myThread.synchronizationTools.CycilcBrries;/**
 * Created by user on 2019/3/22.
 */

import java.util.Map;
import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CyclicBarrier;

/**
 * @ClassName TomCyclicBrries
 * @Description TODO
 * @Autor user
 * @Date 2019/3/22 17:21
 * @Version 1.0
 **/
public class TomCyclicBrries {

    private static CyclicBarrier cyclicBarrier = new CyclicBarrier(3,new Thread(new CountThread()));
    private static ConcurrentHashMap<String, Long> hashMap = new ConcurrentHashMap<>();
    /**
     * 统计线程
     */
    private static class CountThread implements Runnable{

        StringBuffer buffer = new StringBuffer();
        @Override
        public void run() {
            for(Map.Entry<String, Long> entry : hashMap.entrySet()){

                buffer.append(entry.getValue());

            }
            System.out.println("共执行了："+buffer.toString()+"个任务");
        }
    }


    private static class BussinessThread implements Runnable{

        @Override
        public void run() {
            System.out.println("当前工作线程名字：" + Thread.currentThread().getName() + "进行一些公共的业务");
            hashMap.putIfAbsent(Thread.currentThread().getId() + "",Thread.currentThread().getId());
            Random random = new Random();
            if(random.nextBoolean()){
                System.out.println("当前工作线程:" + Thread.currentThread().getId() + "执行111操作");
            }else{
                System.out.println("当前工作线程:" + Thread.currentThread().getId() + "执行222操作");
            }

            try {
                cyclicBarrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }

            System.out.println("当前工作线程名字：" + Thread.currentThread().getId() + "进行业务操作");
        }
    }


    public static void main(String[] args) {

        for (int i=0; i<3; i++){
            new Thread(new BussinessThread()).start();
        }

    }
}
