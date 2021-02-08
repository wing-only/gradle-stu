package com.wing.gradle.order.service.impl;

import com.wing.gradle.order.service.IOrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements IOrderService {
    @Override
    public String info() {
        return "iphone plus 20";
    }
}
