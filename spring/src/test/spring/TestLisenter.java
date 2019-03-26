package spring;/**
 * Created by user on 2018/10/11.
 */


import com.late.chap1.Person;
import com.late.event.EventConfig;
import com.late.event.PublishEvent;
import com.late.event.TomCustomApplicationEvent;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName TestChap1
 * @Description 通过最基本的通过配置文件来加载bean到ioc容器。
 * @Autor user
 * @Date 2018/10/11 16:05
 * @Version 1.0
 **/
public class TestLisenter {

    @Test
    public void test(){
        ApplicationContext app = new AnnotationConfigApplicationContext(EventConfig.class);
        String[] beanNamesForType = app.getBeanNamesForType(PublishEvent.class);
        System.out.println(beanNamesForType[0]);
        System.out.println("容器加载完成");
        PublishEvent event = (PublishEvent) app.getBean("publishEvent");
        event.publishName("zhangjc");
    }
}
