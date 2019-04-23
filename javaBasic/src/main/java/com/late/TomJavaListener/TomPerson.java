package com.late.TomJavaListener;/**
 * Created by user on 2019/4/23.
 */

/**
 * @ClassName TomPerson
 * @Description 主体对象
 * @Autor user
 * @Date 2019/4/23 14:52
 * @Version 1.0
 **/
public class TomPerson {
    private Listener listener;

    //注册监听
    public void registListen(){
        this.listener = new TomPersonListener();
    }

    //监听完成
    public void doListen(){
        System.out.println(
                "事件完成，监听结束"
        );
    }

    public void run(){
        System.out.println("tomPerson 开始执行run()方法");
        if(listener != null){
            listener.readListen(new Event(this));
        }
        System.out.println("tomPerson 结束执行run()方法");
    }

    public void read(){
        System.out.println("tomPerson 开始执行read()方法");
        if(listener != null){
            listener.readListen(new Event(this));
        }
        System.out.println("tomPerson 结束执行read()方法");
    }



}
