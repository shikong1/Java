package com.springboot.chapter6.controller;

import com.springboot.chapter6.pojo.User;
import com.springboot.chapter6.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/shikong/*")
public class UserController {
    @Autowired
    private UserService userService=null;

    @GetMapping("getuser")
    @ResponseBody
    public User getUser(Long id){
        System.out.println("id====="+id);
        return userService.getUser(id);
    }

    @RequestMapping("insert")
    @ResponseBody
    public Map<String,Object> insertUser(String userName,String note){
        User user=new User();
        user.setUserName(userName);
        user.setNote(note);
        //结果会回填主键，返回插入条数
        int update=userService.insertUser(user);
        Map<String,Object> result=new HashMap<>();
        result.put("success",update==1);
        result.put("user",user);
        return result;
    }
}
