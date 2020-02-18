package com.thislx.aop.test;

import com.thislx.aop.entity.City;
import com.thislx.aop.utils.CommUtils;

/**
 * 测试类
 *
 * @author lixiang
 * @version V1.0
 * @date 2020/2/18 11:29
 **/
public class Test {

    public static void main(String[] args) {
        City city = new City();
        city.setId("123");
        city.setName("test");
        String sqlStr = CommUtils.builderSQL(city);
        // select * from city where id = '123' and name = 'test'
        System.out.println(sqlStr);
    }
}
