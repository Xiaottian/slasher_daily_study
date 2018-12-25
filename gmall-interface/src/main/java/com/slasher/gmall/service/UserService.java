/**
 * ProjectName:    slasher-gmall
 * PackageName:    com.slasher.gmall.service
 * FileName：      UserService.java
 * Copyright:      Copyright(C) 2018
 * Company:        北京神州泰岳软件股份有限公司
 * Author:         JIT
 * CreateDate:     2018/12/25 11:51
 */

package com.slasher.gmall.service;

import com.slasher.gmall.bean.UserAddress;

import java.util.List;

public interface UserService {
    /**
     * 获取用户收货地址
     * @param userId
     * @return
     */
    public List<UserAddress> getUserAddressList(String userId);
}
