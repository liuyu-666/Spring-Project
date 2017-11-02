package com.kaishengit.test;


import com.kaishengit.entity.User;
import com.kaishengit.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author liuyu
 * @date 2017/10/31
 */
public class UserServiceTest extends BaseTest {

    @Autowired
    UserService userService;

    @Test
    public void save(){
        User user = new User();
        user.setName("wanghui");
        user.setAddress("suzhou");
        userService.save(user);
    }

}
