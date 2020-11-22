package com.qf.Handle;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.lang.Nullable;

import java.lang.reflect.Method;

/**
 * Created by 54110 on 2020/11/16.
 */
public class AopHandle implements MethodBeforeAdvice {
    //执行业务方法前 先来执行
    public void before(Method method, Object[] objects, @Nullable Object o) throws Throwable {
        System.out.println("进入了 方法执行前的增强");
    }
}
