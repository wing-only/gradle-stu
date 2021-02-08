package com.wing.gradle.order.controller;

import com.wing.gradle.order.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    IOrderService orderService;


    @RequestMapping("/info")
    @ResponseBody
    public String info(){
        return orderService.info();
    }

}
