
package com.zhangjc.springStudy;
/**
 * Created by user on 2018/10/11.
 */

import com.zhangjc.springStudy.chap7.config.Chap7Config;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName TestChap1
 * @Description  测试不同的势力注入方式
 * @Autor user
 * @Date 2018/10/11 16:05
 * @Version 1.0
 **/
public class TestChap7 {

    @Test
    public void test(){
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Chap7Config.class);

        //打印加载到容器的所有bean的名字
        String [] names = app.getBeanDefinitionNames();
        for(String name : names){
            System.out.println(name);
        }


        System.out.println("容器初始化完成！！！！！！！！！！");

        app.close();

    }
}
