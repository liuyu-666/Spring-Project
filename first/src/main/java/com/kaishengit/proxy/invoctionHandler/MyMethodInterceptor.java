package com.kaishengit.proxy.invoctionHandler;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author liuyu
 * @date 2017/10/26
 */
public class MyMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("涨价1000元");
        Object result = methodProxy.invokeSuper(o,objects);
        System.out.println("送口香糖");
        return result;
    }
}
