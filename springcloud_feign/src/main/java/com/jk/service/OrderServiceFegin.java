package com.jk.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@FeignClient("service-order")//声明为feig客户端 指明要调用的服务
public interface OrderServiceFegin extends OrderService{

}
