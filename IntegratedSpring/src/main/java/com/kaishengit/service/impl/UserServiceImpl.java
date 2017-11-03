package com.kaishengit.service.impl;

import com.github.pagehelper.PageHelper;
import com.kaishengit.entity.User;
import com.kaishengit.entity.UserExample;
import com.kaishengit.mapper.UserMapper;
import com.kaishengit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liuyu
 * @date 2017/11/3
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findById(int id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<User> findAll() {
        PageHelper.startPage(1,5);
        return userMapper.selectByExample(new UserExample());
    }

    @Override
    public void save(User user) {
        userMapper.insert(user);
    }
}
