package com.yu.service.Impl;

import com.yu.bean.UserAddress;
import com.yu.service.OrderService;
import com.yu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 14:49 2021/10/17
 * @Modified By:
 *
 * 1.将服务提供者注册到注册中心（暴露服务）
 *  1）导入Dubbo的依赖\操作zookeeper的客户端
 *  2）配置服务提供者
 *
 *2.让服务消费者去注册中心订阅服务提供者的服务地址
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    public UserService userService;
    @Override
    public List<UserAddress> initOrder(String userId) {
        System.out.println("用户id："+userId);
        //1.查询用户的收货地址
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        for (UserAddress userAddress : addressList) {
            System.out.println(userAddress.getUserAddress());
        }
        return addressList;
    }
}
