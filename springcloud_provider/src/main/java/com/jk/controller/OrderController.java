package com.jk.controller;

import com.jk.mapper.OrderMapper;
import com.jk.pojo.BootTree;
import com.jk.pojo.Goods;
import com.jk.pojo.Order;
import com.jk.service.OrderService;
import com.jk.utils.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class OrderController implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    //标明此方法只接收get请求
    //@RequestMapping(value = "queryOrder",method= RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> queryOrder(){
        Map<String, Object> order = new HashMap<>();
        order.put("orderId","a6s5d4sf4d5fgh");
        order.put("orderDesc","iphone XS MAX");
        order.put("orderPrice",9999);
        return order;
    }

    @Override     //@RequestBody 把json字符串 转成对应对象
    @ResponseBody
    public void saveOrder(@RequestBody Order order) {
        System.out.println("order = [" + order.toString() + "]");

    }

    @Override
    @ResponseBody
    public List<Goods> getList() {
        return orderMapper.getList();
    }


    /*@Override
    @ResponseBody
    public List<BootTree> bootstraptree() {
        int id = -1;
        List<BootTree> bootreeNode = bootreeNode(id);
        return bootreeNode;
    }

    private List<BootTree> bootreeNode(int id) {
        List<BootTree> bootstraptree = orderMapper.bootstraptree(id);
        for (BootTree bootstapBean2 : bootstraptree) {
            Integer id2 = bootstapBean2.getId();
            List<BootTree> bootreeNode = bootreeNode(id2);
            if (bootreeNode == null || bootreeNode.size() <= 0) {
                bootstapBean2.setSelectable(true);
            } else {
                bootstapBean2.setSelectable(false);
                bootstapBean2.setNodes(bootreeNode);
            }
        }
        return bootstraptree;
    }*/



    @Override
    @ResponseBody
    public void deleteName(Integer[] arr) {
        orderMapper.deleteName(arr);
    }

    @Override
    @ResponseBody
    public void saveUser(@RequestBody Goods goods) {
        orderMapper.saveUser(goods);
    }

    /*@Override
    @ResponseBody
    public Goods echo(Integer id) {
        return orderMapper.echo(id);
    }

    @Override
    @ResponseBody
    public void updateUser(@RequestBody Goods goods) {
        orderMapper.updateUser(goods);
    }
*/

}
