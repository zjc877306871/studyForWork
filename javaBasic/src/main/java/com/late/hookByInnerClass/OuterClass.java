package com.late.hookByInnerClass;/**
 * Created by user on 2019/4/23.
 */

/**
 * @ClassName OuterClass
 * @Description 内部类和匿名内部类，实现方法回调
 * @Autor user
 * @Date 2019/4/23 16:16
 * @Version 1.0
 **/
public class OuterClass {

    private class InnerClassImpl implements InnerInterface {

        @Override
        public void inner() {
            System.out.println("内部类的inner()执行！！！");
        }

        @Override
        public OuterClass callBack(){
            return OuterClass.this;
        }
    }


    public InnerInterface createInnnerClass(){
        return new InnerInterface(){

            @Override
            public void inner() {
                System.out.println("inner 方法执行");
            }

            @Override
            public OuterClass callBack(){
                return OuterClass.this;
            }
        };

    }


    public static void main(String[] args) {
        OuterClass out = new OuterClass();
        System.out.println(out);
        InnerInterface inner = out.createInnnerClass();
        inner.inner();
        OuterClass out1 = inner.callBack();
        out1.toString();
        System.out.println(out1);
    }

}
