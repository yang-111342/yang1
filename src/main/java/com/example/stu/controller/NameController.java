package com.example.stu.controller;

import com.example.stu.bean.Name;
import com.example.stu.service.HiveService;
import com.example.stu.service.NameService;
import com.google.inject.internal.util.$Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author eibiu
 */
@RestController
public class NameController {

    @Autowired
    private NameService nameService;

    @Autowired
    private HiveService hiveService;


    @RequestMapping("/name")
    public Map<String,Object> getData(){
        Map<String,Object> map = new HashMap<>(16);
//        List<Name> data  = nameService.getData();
//        String sql = "select * from s";
        List<Map<String,Object>> list = hiveService.getSessionIdCount();
        //把结果写入到数据库中，mybatis写？请大家下去完成
//        map.put("key","test123");
//       map.put("data",data);
        map.put("hive",list);
        return map;
    }

}
