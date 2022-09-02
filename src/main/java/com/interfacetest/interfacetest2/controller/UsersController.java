package com.interfacetest.interfacetest2.controller;

import com.interfacetest.interfacetest2.entity.Users;
import com.interfacetest.interfacetest2.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @PostMapping("/addUser")
    public String addUser(Users users){
        try {
            this.usersService.addUser(users);
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
        return "redirect:/success";
    }

    @PostMapping("/addUser2")
    public String addUser2(Users users){
        try {
            this.usersService.addUser2(users);
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
        return "redirect:/success";
    }
}
