package com.kaishengit.service;

import com.kaishengit.entity.User;

import java.util.List;

/**
 * @author liuyu
 * @date 2017/10/30
 */
public interface UserService {
    User findById(int id);
    List<User> findAll();
    void save(User user);
}
