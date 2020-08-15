package com.udesk.spring_boot_demo.controller;

import com.udesk.spring_boot_demo.entity.User;
import com.udesk.spring_boot_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    public String findAll(){

        List<User> users =  userService.findAllUsers();

        for(User e: users){
            System.out.println(e);
        }

        return "/users.html";
    }

    @GetMapping("/{id}")
    @ResponseBody
    public User findOneUser(@PathVariable Integer id) throws Exception {
        User user = userService.findOneUser(id);
        return  user;
    }

}
