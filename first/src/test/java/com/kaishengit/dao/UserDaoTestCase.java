package com.kaishengit.dao;

import com.kaishengit.service.UserService;
import com.kaishengit.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author liuyu
 * @date 2017/10/26
 */
public class UserDaoTestCase {

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

    @Test
    public void save(){
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.save();
    }
    @Test
    public void delete() {
        UserService userService = (UserService)applicationContext.getBean("userServiceImpl");
        userService.delete();
    }
    @Test
    public void saveDao(){
        UserServiceImpl userService = (UserServiceImpl)applicationContext.getBean("userServiceImpl");
        userService.saveDao();
    }


}
