package com.jk.controller;

import com.jk.pojo.BootTree;
import com.jk.pojo.Goods;
import com.jk.pojo.Order;
import com.jk.service.OrderServiceFegin;
import com.jk.utils.FileUtil;
import com.jk.utils.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("tree")
public class OrderController {
    @Autowired
    private OrderServiceFegin orderServiceFegin;
    @GetMapping("queryOrder")
    @ResponseBody
    public Map<String,Object> queryOrder(){

        return orderServiceFegin.queryOrder();
    }
    @PostMapping("saveOrder")
    @ResponseBody
    public void saveOrder(@RequestBody Order order){

        orderServiceFegin.saveOrder(order);
    }


   /* //树
    @GetMapping("gettree")
    @ResponseBody
    public List<BootTree> bootstraptree(){

        return orderServiceFegin.bootstraptree();
    }

    @RequestMapping("Tree")
    public String Tree() {

        return "bootTree";
    }*/

    //bootstrap分页查询
    @GetMapping("getList")
    @ResponseBody
    public List<Goods> getList(){

        return orderServiceFegin.getList();
    }

    @RequestMapping("toList")
    public String toList() {

        return "list";
    }

    //bootstrap删除 ，批量删除
    @DeleteMapping("deleteName")
    @ResponseBody
    public Boolean deleteName(Integer[] arr) {
        try {
            orderServiceFegin.deleteName(arr);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //跳转新增页面
    @RequestMapping("addUser")
    public String addUser() {
        return "add";
    }

    //bootstrap新增
    @PostMapping("saveCollege")
    @ResponseBody
    public Boolean saveUser(@RequestBody Goods goods) {
        if (goods.getId() == null) {
            try {
                //如果有id则修改，没有则新增
                orderServiceFegin.saveUser(goods);
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return true;
    }

    //图片上传
    /*@ResponseBody
    @RequestMapping("upload")
    public HashMap<String, String> upload(MultipartFile img, HttpServletRequest request) {
        HashMap<String, String> result = new HashMap<>();
        String fileUpload = FileUtil.FileUpload(img, request);
        result.put("img", fileUpload);
        return result;
    }

    //跳转修改页面
    @RequestMapping("toUser")
    public String toUser() {
        return "update";
    }

    //bootstrap回显
    @GetMapping("echo")
    @ResponseBody
    public Goods echo(Integer id) {
        Goods user = orderServiceFegin.echo(id);
        return user;
    }

    //bootstrap修改
    @PostMapping("updateUser")
    @ResponseBody
    public Boolean updateUser(@RequestBody Goods goods) {
        try {
            orderServiceFegin.updateUser(goods);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @RequestMapping("toList")
    public String toList() {

        return "list";
    }
    @RequestMapping("toAdd")
    public String toAdd() {

        return "add";
    }
    @RequestMapping("toDeup")
    public String toDeup() {

        return "update";
    }*/
}
