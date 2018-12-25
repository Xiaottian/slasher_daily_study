/**
 * ProjectName:    slasher-gmall
 * PackageName:    com.slasher.gmall.controller
 * FileName：      OrderController.java
 * Copyright:      Copyright(C) 2018
 * Company:        北京神州泰岳软件股份有限公司
 * Author:         JIT
 * CreateDate:     2018/12/25 16:32
 */

package com.slasher.gmall.controller;

import com.slasher.gmall.bean.UserAddress;
import com.slasher.gmall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {


    @Autowired
    OrderService orderService;

    @RequestMapping("/initOrder")
    public List<UserAddress> initOrder(@RequestParam("uid")String userId){
        return orderService.initOrder(userId);
    }
}
