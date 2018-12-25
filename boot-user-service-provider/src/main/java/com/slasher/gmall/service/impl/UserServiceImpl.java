/**
 * ProjectName:    slasher-gmall
 * PackageName:    com.slasher.gmall.service.impl
 * FileName：      UserServiceImpl.java
 * Copyright:      Copyright(C) 2018
 * Company:        北京神州泰岳软件股份有限公司
 * Author:         JIT
 * CreateDate:     2018/12/25 11:52
 */

package com.slasher.gmall.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.slasher.gmall.bean.UserAddress;
import com.slasher.gmall.service.UserService;
import org.springframework.stereotype.Component;


import java.util.Arrays;
import java.util.List;

@Service//暴露服务
@Component
public class UserServiceImpl implements UserService{

    /**
     * 获取用户收货地址
     *
     * @param userId
     * @return
     */
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress address1 = new UserAddress(1,"天通苑北1区","1","老王","010-110","Y");
        UserAddress address2 = new UserAddress(2,"天通苑北2区","1","老李","010-110","N");
        return Arrays.asList(address1,address2);
    }
}
