package com.thislx.aop.dao;

/**
 * 如果是面向接口编程：对象默认使用JDK代理
 * 如果是面向对象编程：对象不使用代理
 * <p>
 * DaoImpl放置在BeanFactory中，从BeanFactory中获取的DaoImpl是一个代理对象，并不是目标对象那个
 *
 * @author lixiang
 * @version V1.0
 * @date 2020/2/18 15:52
 **/
public interface Dao {
    void test();
}
