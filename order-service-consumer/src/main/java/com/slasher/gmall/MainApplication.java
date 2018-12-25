/**
 * ProjectName:    slasher-gmall
 * PackageName:    com.slasher.gmall
 * FileName：      MainApplication.java
 * Copyright:      Copyright(C) 2018
 * Company:        北京神州泰岳软件股份有限公司
 * Author:         JIT
 * CreateDate:     2018/12/25 15:09
 */

package com.slasher.gmall;

import com.slasher.gmall.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class MainApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");

        OrderService orderService = context.getBean(OrderService.class);
        orderService.initOrder("1");
        System.out.println("调用完成");
        System.in.read();
    }
}
