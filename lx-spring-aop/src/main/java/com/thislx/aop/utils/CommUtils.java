package com.thislx.aop.utils;

import com.thislx.aop.annotation.Table;
import javafx.scene.control.Tab;

import javax.swing.text.html.parser.Entity;
import java.lang.annotation.Annotation;

/**
 * @author lixiang
 * @version V1.0
 * @date 2020/2/18 11:28
 **/
public class CommUtils {

    /**
     * 通过对象返回查询SQL语句
     *
     * @param object
     * @return
     */
    public static String builderSQL(Object object) {
        Class clazz = object.getClass();
        // 判断对象上是否增加某一个注解
        boolean annotationPresent = clazz.isAnnotationPresent(Table.class);
        if (annotationPresent) {
            // 获取类上面自定义注解的对象
            Table table = (Table) clazz.getAnnotation(Table.class);
            // 获取自定义注解
            String value = table.value();
            System.out.println(value);
        }
        System.out.println(annotationPresent);
        return "";
    }
}
