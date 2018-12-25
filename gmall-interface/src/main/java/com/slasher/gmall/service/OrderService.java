/**
 * ProjectName:    slasher-gmall
 * PackageName:    com.slasher.gmall
 * FileName：      OrderService.java
 * Copyright:      Copyright(C) 2018
 * Company:        北京神州泰岳软件股份有限公司
 * Author:         JIT
 * CreateDate:     2018/12/25 12:57
 */

package com.slasher.gmall.service;

import com.slasher.gmall.bean.UserAddress;

import java.util.List;

public interface OrderService {
    /**
     * 初始化订单
     * @param userId
     */
    public List<UserAddress> initOrder(String userId);
}
