package com.late.event;/**
 * Created by zjc on 2019/3/26.
 */

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
}