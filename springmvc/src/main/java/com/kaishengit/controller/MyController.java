package com.kaishengit.controller;

import com.kaishengit.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * @author liuyu
 * @date 2017/11/2
 */
@Controller
public class MyController {

    @GetMapping("/hello")
    public String hello(){
        System.out.println("hello.springMVC");
        return "hello";
    }
    @GetMapping("/save")
    public String save(int id, @RequestParam(required = false)String name, Model model) {
        model.addAttribute("massage","success");
        System.out.println(id + "------" + name);
        return "hello";
    }
    @GetMapping("/find/{id}")
    public String find(@PathVariable int id ,RedirectAttributes redirectAttributes) {
        System.out.println(id);
        redirectAttributes.addAttribute("id",id);
        return "redirect:/save";
    }

    @GetMapping("/form")
    public String form(){

        return "hello";
    }
    @PostMapping("/form")
    public String form(String url){
        System.out.println(url);
        return "redirect:/" + url;
    }
    @GetMapping("/upload")
    public String upload() {
        return "upload";
    }

    @GetMapping("/user")
    @ResponseBody
    public User findById() {
        User user = new User();
        user.setId(12);
        user.setName("Alex");
        user.setPassword("456654");
        return  user;
    }

    @PostMapping("/upload")
    public String upload(MultipartFile img) {

        if (!img.isEmpty()) {

            String name = img.getOriginalFilename();
            long size = img.getSize();
            System.out.println(name + "-------" + size);
        }
            return "hello";

    }

    

}
