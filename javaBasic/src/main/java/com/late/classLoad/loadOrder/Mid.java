package com.late.classLoad.loadOrder;/**
 * Created by user on 2019/3/25.
 */

/**
 * @ClassName Mid
 * @Description TODO
 * @Autor user
 * @Date 2019/3/25 17:19
 * @Version 1.0
 **/
public class Mid extends Root
{
    static{
        System.out.println("Mid的静态初始化块");
    }
    {
        System.out.println("Mid的普通初始化块");
    }
    public Mid()
    {
        System.out.println("Mid的无参数的构造器");
    }
    public Mid(String msg)
    {
        //通过this调用同一类中重载的构造器
        this();
        System.out.println("Mid的带参数构造器，其参数值：" + msg);
    }
}
