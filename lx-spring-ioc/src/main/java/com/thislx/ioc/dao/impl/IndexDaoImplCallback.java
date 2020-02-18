package com.thislx.ioc.dao.impl;

import com.thislx.ioc.dao.IndexDao;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 *
 * InitializingBean: 初始化Bean  缺点：侵入性比较强  建议使用@PostConstruct
 * @author lixiang
 * @version V1.0
 * @date 2020/2/17 17:33
 **/
@Component("callback")
public class IndexDaoImplCallback implements IndexDao, InitializingBean {


    public IndexDaoImplCallback(){
        System.out.println("constructor");
    }

    @Override
    public void test() {
        System.out.println("test2");
    }


    /**
     *
     * spring bean的初始化方法
     * @date 2020/2/18 10:58
     * @author lixiangx@leimingtech.com
     **/
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("init");
    }
}
