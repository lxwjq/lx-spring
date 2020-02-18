package com.thislx.aop.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 自定义aspectJ
 * <p>
 * SpringAOP与AspectJ的关系：
 * springAop、AspectJ都是Aop的实现，SpringAop有自己的语法，但是语法复杂，
 * 所以SpringAop借助了AspectJ的注解，但是底层实现还是自己的
 *
 * @author lixiang
 * @version V1.0
 * @date 2020/2/18 15:09
 **/
@Component
// @Aspect注解并不是在Spring的包下面，
@Aspect
public class CustomerAspectJ {

    /**
     * 定义切点（使用表达式进行实现）
     */
    @Pointcut("execution(* com.thislx.aop.dao.*.*(..))")
    public void pointCut() {
    }

    /**
     * 在通知之前的操作,参数切点的方法名/定义切点的表达式
     * 支持表达式&&  eg:@Before("execution(* com.thislx.aop.dao.*.*(..)) && !pointCut()")
     */
    @Before("pointCut()")
//    @Before("execution(* com.thislx.aop.dao.*.*(..)) && pointCut()")
    public void before(JoinPoint joinPoint) {
        // joinPoint 当前切入点，可以根据此对象获取代理对象、目标对象等信息
        // 获取目标对象
//        System.out.println(joinPoint.getTarget());
        // 获取代理对象
//        System.out.println(joinPoint.getThis());
        System.out.println("before");
    }


    /**
     * 通知之后的操作
     */
    @After("pointCut()")
    public void after(JoinPoint joinPoint) {
        // 获取目标对象
//        System.out.println(joinPoint.getTarget());
        // 获取代理对象
//        System.out.println(joinPoint.getThis());
        System.out.println("after");
    }


    /**
     * 环绕通知
     * Proceedingjoinpoint 和JoinPoint的区别:
     * Proceedingjoinpoint 继承了JoinPoint,proceed()这个是aop代理链执行的方法。并扩充实现了proceed()方法，用于继续执行连接点。JoinPoint仅能获取相关参数，无法执行连接点。
     * JoinPoint的方法
     * 1.java.lang.Object[] getArgs()：获取连接点方法运行时的入参列表；
     * 2.Signature getSignature() ：获取连接点的方法签名对象；
     * 3.java.lang.Object getTarget() ：获取连接点所在的目标对象；
     * 4.java.lang.Object getThis() ：获取代理对象本身；
     * proceed()有重载,有个带参数的方法,可以修改目标方法的的参数
     *
     * @param pjp
     */
    @Around("pointCut()")
    public void around(ProceedingJoinPoint pjp) {
        // 获取当前切入点的参数
        Object[] args = pjp.getArgs();
        System.out.println("start");
        try {
            // 执行方法 相当于invoke
            pjp.proceed();
            // 可以使用传参执行方法
            pjp.proceed(args);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("end");
    }
}
