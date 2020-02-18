package com.thislx.ioc.dao.impl;

import com.thislx.ioc.dao.IndexDao;
import org.springframework.stereotype.Component;

/**
 * @author lixiang
 * @version V1.0
 * @date 2020/2/17 17:33
 **/
@Component("dao2")
public class IndexDaoImpl2 implements IndexDao {

    @Override
    public void test() {
        System.out.println("test2");
    }
}
