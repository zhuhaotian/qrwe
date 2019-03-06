package com.jk.mapper;

import com.jk.pojo.BootTree;
import com.jk.pojo.Goods;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.List;

public interface OrderMapper {
    /*@GetMapping("gettree")
    List<BootTree> bootstraptree(int id);*/


    List<Goods> getList();

    void deleteName(Integer[] arr);

    void saveUser(Goods goods);

    /*Goods echo(Integer id);

    void updateUser(Goods goods);*/
}
