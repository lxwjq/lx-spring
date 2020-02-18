package com.thislx.proxy.utils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 自定义InvocationHandler
 *
 * @author lixiang
 * @version V1.0
 * @date 2020/2/18 20:52
 **/
public class LxInvocationHandler implements InvocationHandler {

    private Object target;

    public LxInvocationHandler(Object target) {
        this.target = target;
    }

    /**
     * 定义代理逻辑方法
     *
     * @param proxy:  代理对象
     * @param method: 目标对象的方法
     * @param args:   目标对象的方法参数
     * @return 代理对象的方法反射执行的结果
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("LxInvocationHandler invoke");
        // 使用method.invoke进行反射，但是需要获取目标对象，因此增加一个参数为目标对象的代理方法
        return method.invoke(this.target, args);
    }
}
