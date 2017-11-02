package com.kaishengit.service.impl;

import com.kaishengit.entity.User;
import com.kaishengit.mapper.UserMapper;
import com.kaishengit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liuyu
 * @date 2017/10/31
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public void save(User user) {
        userMapper.insert(user);
    }
}
