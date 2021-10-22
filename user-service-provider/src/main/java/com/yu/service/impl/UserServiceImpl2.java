package com.yu.service.impl;

import com.yu.bean.UserAddress;
import com.yu.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 14:41 2021/10/17
 * @Modified By:
 */
@Service
public class UserServiceImpl2 implements UserService {
    public List<UserAddress> getUserAddressList(String userId) throws InterruptedException {

        System.out.println("UserServiceImpl---new---");
        UserAddress address1 = new UserAddress(1, "河南省郑州巩义市宋陵大厦2F", "1", "安然", "150360313x", "Y");
        UserAddress address2 = new UserAddress(2, "北京市昌平区沙河镇沙阳路", "1", "情话", "1766666395x", "N");
        Thread.sleep(4000);
        return Arrays.asList(address1,address2);
    }
}
