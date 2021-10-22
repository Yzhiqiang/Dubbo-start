package com.yu.service.Impl;

import com.yu.bean.UserAddress;
import com.yu.service.UserService;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 21:43 2021/10/18
 * @Modified By:
 */
public class UserServiceStub implements UserService {

    public final UserService userService;

    /**
     * 传入的是UserService的远程代理对象
     * @param userService
     */
    public UserServiceStub(UserService userService) {
        this.userService = userService;
    }

    @Override
    public List<UserAddress> getUserAddressList(String userId) throws InterruptedException {
        System.out.println("UserServiceStub----------");
        if(!StringUtils.isEmpty(userId))
        {
            return userService.getUserAddressList(userId);
        }
        return null;
    }
}
