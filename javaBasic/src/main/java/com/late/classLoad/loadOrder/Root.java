package com.late.classLoad.loadOrder;/**
 * Created by user on 2019/3/25.
 */

/**
 * @ClassName Demo
 * @Description 主要是验证类加载器过程中   对代码块、静态变量、常量的初始化顺序
 * @Autor user
 * @Date 2019/3/25 17:13
 * @Version 1.0
 **/
public class Root {
        private String name;
        private static int i = 0;
        private final int j = 2;

        static{
            System.out.println("Root的静态初始化块");
        }
        {
            System.out.println("Root的普通初始化块");
        }
        public Root()
        {
            System.out.println("Root的无参数的构造器");
        }

    public Root(String name) {
        System.out.println("Root的有参数的构造器");
        System.out.println("i的值：" + i);
        System.out.println("j的值：" + j);
        this.name = name;

    }

    public String getName() {
        return name;
    }

    /**
     * 测试对象new时，类的初始化过程
     * @param args
     */
    public static void main(String[] args) {
        Leaf leaf = new Leaf();
        Root root = new Root("张三");
        System.out.println("root的名字：" + root.getName());
    }


    }


