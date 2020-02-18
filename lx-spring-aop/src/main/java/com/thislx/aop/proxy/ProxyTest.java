package com.thislx.aop.proxy;

import com.thislx.aop.dao.Dao;
import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @author lixiang
 * @version V1.0
 * @date 2020/2/18 16:07
 **/
public class ProxyTest {

    public static void main(String[] args) {
        // 使用ProxyGenerator生产代理对象的字节码
        // 参一：生产代理对象的类名。参二代理对象实现的接口集合
        byte[] proxyTestTemps = ProxyGenerator.generateProxyClass("ProxyTestTemp", new Class[]{Dao.class});

        try {
            // 将字节码文件写入到磁盘
            File file = new File("D:\\ProxyTestTemp.class");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(proxyTestTemps);
            fos.flush();
            // JDK1.8以后流对象自动会帮你关闭
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 最终得到的类为以下信息
        // public final class ProxyTestTemp extends Proxy implements Dao
        // JDK动态代理 会使代理类继承Proxy，因此JDK动态代理是基于接口聚合实现的。
    }
}
