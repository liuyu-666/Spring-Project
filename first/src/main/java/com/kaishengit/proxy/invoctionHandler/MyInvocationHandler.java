package com.kaishengit.proxy.invoctionHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author liuyu
 * @date 2017/10/26
 */
public class MyInvocationHandler implements InvocationHandler {

    private Object target;

    public MyInvocationHandler(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("+++++++");
        Object result = method.invoke(target,args);
        System.out.println("+++++++");
        return result;
    }



}
