package com.yu.service;



import com.yu.bean.UserAddress;

import java.util.List;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 14:42 2021/10/17
 * @Modified By:
 */
public interface UserService {
    public List<UserAddress> getUserAddressList(String userId);
}
