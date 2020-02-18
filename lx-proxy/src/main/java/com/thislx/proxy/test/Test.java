package com.thislx.proxy.test;

import com.thislx.proxy.dao.IndexDao;
import com.thislx.proxy.dao.IndexDaoImpl;
import com.thislx.proxy.utils.LxInvocationHandler;

import java.lang.reflect.Proxy;

/**
 * @author lixiang
 * @version V1.0
 * @date 2020/2/18 20:45
 **/
public class Test {
    public static void main(String[] args) {

        // newProxyInstance创建代理对象
        // 参一ClassLoader:当前对象的ClassLoader
        // 参二Class<?>[] interfaces 代理对象的接口
        // 参三InvocationHandler h：自定义InvocationHandler
        IndexDao proxyInstance = (IndexDao) Proxy.newProxyInstance(Test.class.getClassLoader(),
                new Class[]{IndexDao.class},
                new LxInvocationHandler(new IndexDaoImpl()));
        proxyInstance.query();
    }
}
