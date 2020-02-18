package com.thislx.aop.dao;

import org.springframework.stereotype.Repository;

/**
 * @author lixiang
 * @version V1.0
 * @date 2020/2/18 15:19
 **/
@Repository
public class DaoImpl implements Dao {

    @Override
    public void test() {
        System.out.println("test");
    }
}
