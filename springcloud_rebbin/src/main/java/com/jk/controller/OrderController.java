package com.jk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Controller
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("queryOrder")
    @ResponseBody
    public Map<String,Object> queryOrder(){
        Map order = restTemplate.getForObject("http://service-order/queryOrder", Map.class);
        return order;
    }
}
