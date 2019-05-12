package com.hehe.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hehe.mapper.UserMapper;
import com.hehe.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/user/*")
@RequestMapping("/user/*")
public class UserController {



    @SuppressWarnings("all")
    @Autowired
    UserMapper userMapper;


    @GetMapping("findAllByPage")
    public PageInfo<User> findAll(int page, int pageSize) {
        PageHelper.startPage(page, pageSize);//改写语句实现分页查询
        List<User> all = userMapper.findALL();
        System.out.println(all.toString());
        PageInfo<User> info = new PageInfo<>(all);
        return info;
    }

    @GetMapping("add")
    public User addUser(User user){
        userMapper.insertByUser(user);
        return user;
    }
    @GetMapping("update")
    public List<User> updateUser(User user){
        System.out.println(user.toString());
        userMapper.update(user);
        return userMapper.list();
    }


    @GetMapping("list")
    public List<User> list() {
        return userMapper.list();
    }

    @GetMapping("list/{username}")
    public List<User> listByUsername(@PathVariable("username") String username) {
        return userMapper.listByUsername(username);
    }

    @GetMapping("get/{username}/{password}")
    public User get(@PathVariable("username") String username, @PathVariable("password") String password) {
        return userMapper.get(username, password);
    }

    @GetMapping("get/bad/{username}/{password}")
    public User getBadUser(@PathVariable("username") String username, @PathVariable("password") String password) {
        return userMapper.getBadUser(username, password);
    }

}
