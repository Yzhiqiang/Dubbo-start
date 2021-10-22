package com.yu.controller;

import com.yu.bean.UserAddress;
import com.yu.service.OrderService;
import com.yu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 13:49 2021/10/18
 * @Modified By:
 */
@Controller
public class OrderController {

    @Autowired
    OrderService orderService;
    /**
     * 初始化订单
     */
    @ResponseBody
    @RequestMapping("/initOrder")
    public List<UserAddress> InitOrder(String userId) throws InterruptedException {
        System.out.println("用户的id"+userId);
        return orderService.initOrder(userId);
    }
}
