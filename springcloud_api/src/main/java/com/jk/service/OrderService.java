package com.jk.service;


import com.jk.pojo.BootTree;
import com.jk.pojo.Goods;
import com.jk.pojo.Order;
import com.jk.utils.PageResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequestMapping("order")
public interface OrderService {

    @GetMapping("queryOrder")
    Map<String,Object> queryOrder();

    @PostMapping("saveOrder")
    void saveOrder(Order order);

    /*@GetMapping("gettree")
    List<BootTree> bootstraptree();*/

    @GetMapping("getList")
    List<Goods> getList();

    @DeleteMapping
    void deleteName(Integer[] arr);

    @PostMapping("saveCollege")
    void saveUser(Goods goods);

    /*@GetMapping
    Goods echo(Integer id);

    @PostMapping
    void updateUser(Goods goods);*/

}
