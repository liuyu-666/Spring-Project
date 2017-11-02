package com.kaishengit.proxy.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author liuyu
 * @date 2017/10/26
 */
@Component
@Aspect
public class Advice {
    @Pointcut("execution(* com.kaishengit.proxy..*.*(..))")
    public void pointcut(){};
    @Before("pointcut()")
    public void beforeAdvice(){
        System.out.println("前置通知");
    }
}
