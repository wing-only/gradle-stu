package com.wing.gradle.sys.controller;

import com.wing.gradle.sys.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    IUserService userService;

    @RequestMapping("/info")
    @ResponseBody
    public String info(){
        return userService.info();
    }
}
