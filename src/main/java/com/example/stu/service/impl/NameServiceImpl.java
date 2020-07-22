package com.example.stu.service.impl;

import com.example.stu.bean.Name;
import com.example.stu.mapper.NameMapper;
import com.example.stu.service.NameService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author eibiu
 */
@Service
public class NameServiceImpl implements NameService {

    @Autowired
    private NameMapper nameMapper;


    @Override
    public List<Name> getData() {
        return nameMapper.getData();
    }
}
