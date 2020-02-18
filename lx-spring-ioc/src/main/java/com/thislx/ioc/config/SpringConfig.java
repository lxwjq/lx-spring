package com.thislx.ioc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Spring配置文件：
 * 如果想使用xml与javaconfig，需要带入xml配置文件，使用@ImportResource注解
 *
 * @author lixiang
 * @version V1.0
 * @date 2020/2/17 17:49
 **/
@Configuration
@ComponentScan("com")
//@ImportResource("classpath:spring-ioc.xml")
public class SpringConfig {

}
