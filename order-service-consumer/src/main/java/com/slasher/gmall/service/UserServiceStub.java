/**
 * ProjectName:    slasher-gmall
 * PackageName:    com.slasher.gmall.service
 * FileName：      UserServiceStub.java
 * Copyright:      Copyright(C) 2018
 * Company:        北京神州泰岳软件股份有限公司
 * Author:         JIT
 * CreateDate:     2018/12/26 16:36
 */

package com.slasher.gmall.service;

import com.slasher.gmall.bean.UserAddress;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * 本地存根的方式
 */
public class UserServiceStub implements UserService {

    private final UserService userService;

    /**
     * 传入的是userService远程的代理对象
     * @param userService
     */
    public UserServiceStub(UserService userService) {
        this.userService = userService;
    }

    /**
     * 获取用户收货地址
     *
     * @param userId
     * @return
     */
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("UserServiceStub被调用了");
        if (!StringUtils.isEmpty(userId)){
            return userService.getUserAddressList(userId);
        }
        return null;
    }
}
