package com.thislx.ioc;

import com.thislx.ioc.config.SpringConfig;
import com.thislx.ioc.service.TestService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 启动类
 *
 * @author lixiang
 * @version V1.0
 * @date 2020/2/17 17:36
 **/
public class Application {

    public static void main(String[] args) {

        // 1、读取XML获取Application
        // ClassPathXmlApplicationContext classPathXmlApplicationContext =
        //         new ClassPathXmlApplicationContext("classpath:spring-ioc.xml");
        // TestService testService = (TestService) classPathXmlApplicationContext.getBean("test");

        // 2、读取JavaConfig获取Application
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        TestService testService = (TestService) annotationConfigApplicationContext.getBean("test");
        testService.test();
    }
}
