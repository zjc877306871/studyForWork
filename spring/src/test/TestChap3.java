package com.zhangjc.springStudy;/**
 * Created by user on 2018/10/11.
 */

import com.zhangjc.springStudy.chap1.Person;
import com.zhangjc.springStudy.chap3.config.Chap3Config;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName TestChap1
 * @Description 通过注解配置来加载bean到ioc容器。
 * @Autor user
 * @Date 2018/10/11 16:05
 * @Version 1.0
 **/
public class TestChap3 {

    @Test
    public void test(){
        ApplicationContext app = new AnnotationConfigApplicationContext(Chap3Config.class);

        //打印加载到容器的所有bean的名字
//        String [] names = app.getBeanDefinitionNames();
//        for(String name : names){
//            System.out.println(name);
//        }

        Person person1 = (Person) app.getBean("person");
        Person person2 = (Person) app.getBean("person");
        System.out.println(person1 == person2);

    }
}
