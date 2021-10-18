package com.yu.service;

import com.yu.bean.UserAddress;

import java.util.List;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 14:48 2021/10/17
 * @Modified By:
 */
public interface OrderService {
    /**
     * 初始化订单
     * @param userId
     */
    public List<UserAddress> initOrder(String userId);
}
