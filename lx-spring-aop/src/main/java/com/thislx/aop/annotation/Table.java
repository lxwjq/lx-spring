package com.thislx.aop.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解类
 * 元注解：自定义注解上面的注解
 * 详细请查看: https://www.cnblogs.com/kingsonfu/p/10634174.html
 *
 * @author lixiang
 * @version V1.0
 * @date 2020/2/18 11:25
 **/
// @Target配置注解的作用目标(可以指定多个{*,*}) 默认：任意位置
// @Retention 配置注解的生命周期
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Table {

    // 如果自定义注解中只有一个方法，并且方法名为value，使用使用可以省略
    // 例如：@Table(value="city")可以省略为@Table("city")

    /**
     * 使用default设置默认值，
     *
     * @return
     */
    String value() default "";
}
