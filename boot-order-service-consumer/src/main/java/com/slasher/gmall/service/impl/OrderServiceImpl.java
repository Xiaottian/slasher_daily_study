/**
 * ProjectName:    slasher-gmall
 * PackageName:    com.slasher.gmall.impl
 * FileName：      OrderServiceImpl.java
 * Copyright:      Copyright(C) 2018
 * Company:        北京神州泰岳软件股份有限公司
 * Author:         JIT
 * CreateDate:     2018/12/25 12:58
 */

package com.slasher.gmall.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.slasher.gmall.bean.UserAddress;
import com.slasher.gmall.service.OrderService;
import com.slasher.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * 1. 将服务提供者注册到注册中心
 *      1）导入dubbo依赖
 * 2. 让服务消费者去注册中心订阅服务提供者的服务地址
 *
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Reference(loadbalance = "random") //reference中配置 url属性的时候是 dubbo直连的方式，不需要注册中心。面试重点
    UserService userService;
    /**
     * 初始化订单
     *
     * @param userId
     */
    @HystrixCommand(fallbackMethod = "hello")
    @Override
    public List<UserAddress> initOrder(String userId) {

        System.out.println("用户id," + userId);
        // 1.查询用户的收货地址
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        return addressList;
    }

    public List<UserAddress> hello(String userId) {

        return Arrays.asList(new UserAddress(10,"测试地址","1","测试","测试","Y"));
    }
}
