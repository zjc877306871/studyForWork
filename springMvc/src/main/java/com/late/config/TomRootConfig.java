package com.late.config;/**
 * Created by user on 2019/3/28.
 */

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @ClassName TomRootConfig
 * @Description Spring的容器不扫描controller;父容器
 * @Autor user
 * @Date 2019/3/28 13:12
 * @Version 1.0
 **/
@ComponentScan(value = "com.late",excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class})
})
public class TomRootConfig {

}
