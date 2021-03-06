package com.yu.service.Impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yu.bean.UserAddress;
import com.yu.service.OrderService;
import com.yu.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
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

    @Reference(loadbalance = "random", timeout=1000)             //远程引用服务, dubbo
    UserService userService;

    @Override
    public List<UserAddress> initOrder(String userId) throws InterruptedException {
        System.out.println("用户id："+userId);
        //1.查询用户的收货地址
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        return addressList;
    }


    public List<UserAddress> hello(String userId) throws InterruptedException {
       return Arrays.asList(new UserAddress(10,"测试地址","1","测试","测试","Y"));
    }
}
