package com.example.stu.service.impl;

import com.example.stu.service.HiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class HiveServiceImpl implements HiveService {
    @Autowired
    @Qualifier("hiveJdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    @Override
    public  List<Map<String,Object>> getSessionIdCount() {
        String sql = "select * from s order by score";
        List<Map<String,Object>> list = jdbcTemplate.queryForList(sql);
        return list;
    }
}
