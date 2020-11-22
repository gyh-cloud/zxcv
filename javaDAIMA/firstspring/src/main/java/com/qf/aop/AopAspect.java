package com.qf.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by 54110 on 2020/11/16.
 */
public class AopAspect {

    //执行前先来调用的方法
    public void before(){
        System.out.println("执行前调用AOP");
    }

    //执行 后来调用的方法
    public void afterReturing(){
        System.out.println("执行后调用");
    }

    public void afterThrowing(){
        System.out.println("进入了报错后执行的方法");
    }

    public void after(){
        System.out.println("进入了总会执行的方法");
    }

    public Object around(ProceedingJoinPoint pj) throws Throwable {
        System.out.println("进入了环绕通知的 前置通知");
        Object proceed=null;
        try {
            proceed = pj.proceed();
            System.out.println("进入了环绕通知的 后置通知");
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("进入了环绕通知的 异常通知");
        }finally {
            System.out.println("进入了环绕通知的 最终通知");
        }

        return proceed;
    }
}
