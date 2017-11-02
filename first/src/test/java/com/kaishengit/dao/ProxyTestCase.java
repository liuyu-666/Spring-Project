package com.kaishengit.dao;

import com.kaishengit.proxy.Sale;
import com.kaishengit.proxy.invoctionHandler.MyInvocationHandler;
import com.kaishengit.proxy.invoctionHandler.MyMethodInterceptor;
import com.kaishengit.proxy.pc.Dell;
import com.kaishengit.proxy.pc.Lenovo;
import net.sf.cglib.proxy.Enhancer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.lang.reflect.Proxy;

/**
 * @author liuyu
 * @date 2017/10/26
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class ProxyTestCase {
    @Autowired
    private Dell dell;
    @Test
    public void sale(){
        Dell dell = new Dell();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(dell);
        Sale sale = (Sale) Proxy.newProxyInstance(dell.getClass().getClassLoader(),dell.getClass().getInterfaces(),myInvocationHandler);
        sale.sale();
    }
    @Test
    public void service() {
        Dell dell = new Dell();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(dell);
        Sale sale = (Sale)Proxy.newProxyInstance(dell.getClass().getClassLoader(),dell.getClass().getInterfaces(),myInvocationHandler);
        sale.service();
    }
    @Test
    public void lenovoSale() {
         Enhancer enhancer = new Enhancer();
         enhancer.setSuperclass(Lenovo.class);
         enhancer.setCallback(new MyMethodInterceptor());
         Lenovo lenovo = (Lenovo) enhancer.create();
         lenovo.sale();
    }
    @Test
    public void dellsale() {

        dell.sale();

    }

}
