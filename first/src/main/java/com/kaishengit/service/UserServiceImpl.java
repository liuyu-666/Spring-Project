package com.kaishengit.service;

import com.kaishengit.dao.UserDao;

/**
 * @author liuyu
 * @date 2017/10/26
 */
public class UserServiceImpl implements UserService{

    private UserDao dao ;

    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    public void saveDao(){
        dao.save();
    }
    @Override
    public void delete() {
        System.out.println("delete....");
    }
}
