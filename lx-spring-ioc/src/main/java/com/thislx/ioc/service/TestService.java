package com.thislx.ioc.service;

import com.thislx.ioc.dao.IndexDao;
import com.thislx.ioc.dao.impl.IndexDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author lixiang
 * @version V1.0
 * @date 2020/2/17 17:33
 **/
@Service("test")
public class TestService {

    /**
     * 使用构造方式进行注入 对应的xml中需要使用
     * <constructor-arg ref="dao"/>
     * 进行配置
     * @param indexDao
     */
//    public TestService(IndexDao indexDao){
//        this.indexDao = indexDao;
//    }


    /**
     * 1、注入：
     * 使用setter方法进行注入 对应的xml中需要使用
     * <property name="indexDao" ref="dao"/>
     * 进行配置
     * <p>
     * 2、自动装配：
     * bytype 查找SpringBeanFactory中IndexDao类型的Bean注入
     * byName 根据setIndexDao中的indexDao的beanname进行查询
     * eg: 会查询beanname为lx的bean,并不是查询indexDao的bean（XML格式）
     * private IndexDao indexDao;
     * public void setLx(IndexDao indexDao) {
     * this.indexDao = indexDao;
     * }
     *
     * 3、注解形式自动装配
     * @Autowired 默认根据bytype，bytype没有找到时根据byname
     * @Resource 默认根据byname，bytype没有找到时根据byname
     */
    @Resource
    private IndexDao indexDao;

    public void test() {
        indexDao.test();
    }

    public void setIndexDao2(IndexDao indexDao) {
        this.indexDao = indexDao;
    }
}
