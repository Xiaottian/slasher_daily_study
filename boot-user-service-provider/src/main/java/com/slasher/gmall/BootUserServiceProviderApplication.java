package com.slasher.gmall;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

//@ImportResource(locations = "classpath:provider.xml")
@EnableDubbo    //开启基于注解的dubbo功能(开启包扫描)
//@EnableDubbo(scanBasePackages = "com.slasher.gmall")
@EnableHystrix
@SpringBootApplication
public class BootUserServiceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootUserServiceProviderApplication.class, args);
	}

}

