package com.kaishengit.proxy.pc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author liuyu
 * @date 2017/10/26
 */
@Repository
public class Dell  {

    public void sale() {
        System.out.println("Dell销售量+1");
    }


    public void service() {
        System.out.println("Dell售后次数+1");
    }
}
