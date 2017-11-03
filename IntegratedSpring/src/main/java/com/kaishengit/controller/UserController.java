package com.kaishengit.controller;

import com.kaishengit.entity.User;
import com.kaishengit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author liuyu
 * @date 2017/11/3
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @ResponseBody
    @GetMapping("/find/{id}")
    public User findById(@PathVariable int id){
        return userService.findById(id);
    }
    @ResponseBody
    @GetMapping("/find/all")
    public List<User> findAll(){
        return userService.findAll();
    }
    @ResponseBody
    @PostMapping("/save")
    public void  save(String name,String address){
        User user = new User();
        user.setName(name);
        user.setAddress(address);
        userService.save(user);
    }


}
