package listener;/**
 * Created by user on 2019/3/26.
 */

import com.zhangjc.springStudy.chap1.Person;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ApplicationContextEvent;

/**
 * @ClassName TomApplicationContenxLisenter
 * @Description TODO
 * @Autor user
 * @Date 2019/3/26 14:55
 * @Version 1.0
 **/
public class TomApplicationContenxLisenter implements ApplicationListener<ApplicationContextEvent> {

    @Override
    public void onApplicationEvent(ApplicationContextEvent event) {
        Person person = (Person)event.getApplicationContext().getBean("person");
        System.out.println("获取person的名字："+ person.getName());
    }
}
