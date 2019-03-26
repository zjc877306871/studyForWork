package com.late.event;/**
 * Created by zjc on 2019/3/26.
 */

import com.late.chap1.Person;
import com.late.listener.TomApplicationContenxLisenter;
import com.late.listener.TomCustomLisenter;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 描述:
 *
 * @author zjc
 * @create 2019-03-26 23:50
 */
@Configuration
public class EventConfig {
    @Bean
    public PublishEvent publishEvent(){
        return new PublishEvent();
    }

    @Bean
    public TomCustomLisenter tomCustomLisentert(){
        return new TomCustomLisenter();
    }

    @Bean
    public TomApplicationContenxLisenter tomApplicationContenxLisenter(){
        return new TomApplicationContenxLisenter();
    }

    @Bean
    public Person person(){
        return new Person();
    }
}