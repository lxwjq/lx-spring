package com.thislx.aop.test;

import com.thislx.aop.config.AppConfig;
import com.thislx.aop.dao.Dao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author lixiang
 * @version V1.0
 * @date 2020/2/18 15:24
 **/
public class AspectJTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        // 由于Dao.java是一个接口，所有它的实现类DaoImpl在获取的时候是获取的代理对象并不是实际的DaoImpl对象，因此下面一行代码会报错
        Dao dao = (Dao) annotationConfigApplicationContext.getBean("daoImpl");
        dao.test();
    }
}
