package com.thislx.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 配置文件
 *
 * @author lixiang
 * @version V1.0
 * @date 2020/2/18 15:23
 **/
@Configuration
@ComponentScan("com.thislx")
// @EnableAspectJAutoProxy 开始spring对AspectJ的支持
// 参数解释：proxyTargetClass默认为false使用的JDK动态代理，true则是使用cglib动态代理
@EnableAspectJAutoProxy(proxyTargetClass = false)
public class AppConfig {
}
