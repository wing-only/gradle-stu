package com.wing.gradle.sys.service.impl;

import com.wing.gradle.common.BusinessConst;
import com.wing.gradle.sys.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Override
    public String info() {
        return BusinessConst.user;
    }
}
